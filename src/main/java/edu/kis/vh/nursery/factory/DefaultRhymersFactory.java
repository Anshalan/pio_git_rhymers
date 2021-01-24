package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
<<<<<<< HEAD
    public DefaultCountingOutRhymer GetStandardRhymer() {
=======
    public DefaultCountingOutRhymer getStandardRhymer() {
>>>>>>> 1.3.5.2 Fix method names
        return new DefaultCountingOutRhymer();
    }

    @Override
<<<<<<< HEAD
    public DefaultCountingOutRhymer GetFalseRhymer() {
=======
    public DefaultCountingOutRhymer getFalseRhymer() {
>>>>>>> 1.3.5.2 Fix method names
        return new DefaultCountingOutRhymer();
    }

    @Override
<<<<<<< HEAD
    public DefaultCountingOutRhymer GetFIFORhymer() {
=======
    public DefaultCountingOutRhymer getFIFORhymer() {
>>>>>>> 1.3.5.2 Fix method names
        return new FIFORhymer();
    }

    @Override
<<<<<<< HEAD
    public DefaultCountingOutRhymer GetHanoiRhymer() {
=======
    public DefaultCountingOutRhymer getHanoiRhymer() {
>>>>>>> 1.3.5.2 Fix method names
        return new HanoiRhymer();
    }

}
