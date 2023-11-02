public void btnSendRequest(ActionEvent actionEvent) {
    TreeItem<String> selectedItem = (TreeItem<String>) treePaths.getSelectionModel().getSelectedItem();
    switch (selectedItem.getValue()) {
        case "GET":
            Platform.runLater(() -> getRequest());
        case "POST":
            Platform.runLater(() -> postRequest());
        default:
            log.error(selectedItem.getValue() + " not implemented yet");
    }
}
