package Adapter.Adapter_square;

import Adapter.Round.RoundPeg;
import Adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calculate the smallest circle radius that fits the square peg
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}