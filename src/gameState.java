import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class gameState extends State {

    private gameField GameField;

    public gameState(Game game) {
        super(game);
        GameField = new gameField(game);

    }

    @Override
    public void tick() {
        GameField.tick();
    }

    @Override
    public void render(Graphics g) {
        GameField.render(g);
    }

    public MouseManager getMouseManager () {
        return game.getMouseManager();
    }

}
