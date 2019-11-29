public class SimpleAudioEditorImpl implements SimpleAudioEditor {

    private int noise = 0;

    @Override
    public void boostNoise() {
        noise++;
    }

    @Override
    public void reduceNoise() {
        noise--;
    }
}
