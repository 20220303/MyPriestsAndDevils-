public void btnSendRequest(ActionEvent actionEvent) {
    TreeItem<String> selectedItem = (TreeItem<String>) treePaths.getSelectionModel().getSelectedItem();
    if (selectedItem.getValue().equals("GET")) {
        Platform.runLater(() -> getRequest());
    } else if (selectedItem.getValue().equals("POST")) {
        Platform.runLater(() -> postRequest());
    } else {
        log.error(selectedItem.getValue() + " not implemented yet");
    }
}
