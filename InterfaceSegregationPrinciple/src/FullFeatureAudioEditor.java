public class FullFeatureAudioEditor implements AudioEditor, SimpleAudioEditor {

    private int noise = 0;


    @Override
    public void boostNoise() {
        noise++;
    }

    @Override
    public void reduceNoise() {
        noise--;
    }

    @Override
    public void popFiler() {
        // Nothing For now
    }

    @Override
    public void equalize() {
        // Nothing for now
    }

    @Override
    public void reduceEcho() {
        // Nothing for now
    }
}
