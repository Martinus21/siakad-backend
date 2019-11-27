import javafx.application.Application
import javafx.application.Application.launch
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class ClientApp: Application() {
    override fun start(p0: Stage?) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("Home.fxml"))
        p0!!.title = "Home Siakad"
        p0.scene = Scene(root, 800.0, 600.0)
        p0.show()
    }
}
fun main(){
    launch(ClientApp::class.java)
}