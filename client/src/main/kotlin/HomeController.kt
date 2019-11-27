import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage


class HomeController {
    fun handleAddMahasiswa(actionEvent: ActionEvent){
        val root = FXMLLoader.load<Parent>(javaClass.getResource("PopUpAddMahasiswa.fxml"))
        val stage = Stage()
        stage.title = "Add Mahasiswa"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = Scene(root, 400.0, 600.0)
        stage.show()
    }
    fun handleAddDosen(actionEvent: ActionEvent){
        val root = FXMLLoader.load<Parent>(javaClass.getResource("PopUpAddDosen.fxml"))
        val stage = Stage()
        stage.title = "Add Dosen"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = Scene(root, 400.0, 600.0)
        stage.show()
    }
    fun handleAddMatakuliah(actionEvent: ActionEvent){
        val root = FXMLLoader.load<Parent>(javaClass.getResource("PopUpAddMatakuliah.fxml"))
        val stage = Stage()
        stage.title = "Add Matakuliah"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = Scene(root, 400.0, 600.0)
        stage.show()
    }
    fun handleAddNilai(actionEvent: ActionEvent){
        val root = FXMLLoader.load<Parent>(javaClass.getResource("PopUpAddNilai.fxml"))
        val stage = Stage()
        stage.title = "Add Nilai"
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.scene = Scene(root, 400.0, 600.0)
        stage.show()
    }
}