import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Animal {

    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    boolean voa;
    int idadeAnimal;
    String corAnimal;
    float pesoAnimal;
    boolean carnivoro;
    String somDoAnimal; // caminho do arquivo .wav

    public void emitirSom(String caminhoDoArquivo) {
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(caminhoDoArquivo));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printStatus() {
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Idade: " + idadeAnimal);
        System.out.println("Cor: " + corAnimal);
        System.out.println("Peso: " + pesoAnimal);
        System.out.println("Carnívoro: " + carnivoro);
        System.out.println("Numero de patas: " + numeroDePatas);
        System.out.println("Tem rabo?: " + temRabo);
        System.out.println("Voa?: " + voa);
    }

    public static void main(String[] args) {
        Animal baleia = new Animal();
        baleia.nomeAnimal = "Johnson";
        baleia.numeroDePatas = 0;
        baleia.temRabo = true;
        baleia.voa = false;
        baleia.idadeAnimal = 10;
        baleia.corAnimal = "Preto";
        baleia.pesoAnimal = 2000;
        baleia.carnivoro = true;
        baleia.somDoAnimal = "C:\\Users\\Rafael\\Desktop\\projeto\\Sons\\dragon-studio-humpback-whale-382727.wav";

        Animal urubu = new Animal();
        urubu.nomeAnimal = "Mike";
        urubu.numeroDePatas = 2;
        urubu.temRabo = true;
        urubu.voa = true;
        urubu.idadeAnimal = 88;
        urubu.corAnimal = "Preto";
        urubu.pesoAnimal = 10;
        urubu.carnivoro = true;
        urubu.somDoAnimal = "C:\\Users\\Rafael\\Desktop\\projeto\\Sons\\lhegau.wavs";

        baleia.printStatus();
        baleia.emitirSom(baleia.somDoAnimal);
        System.out.println("-------------------");
        urubu.printStatus();
        urubu.emitirSom(urubu.somDoAnimal);
    }
}