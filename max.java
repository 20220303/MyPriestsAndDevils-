public void btnSendRequest(ActionEvent actionEvent) {
    TreeItem<String> selectedItem = (TreeItem<String>) treePaths.getSelectionModel().getSelectedItem();
    String message = selectedItem.getValue() + " not implemented yet"
    switch (selectedItem.getValue()) {
        case "GET":
            Platform.runLater(() -> getRequest());
        case "POST":
            Platform.runLater(() -> postRequest());
        default:
            log.error(message);
    }
}
