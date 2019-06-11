package com.lp.study.innerclass.date20190530;

public class GreenhouseControls extends Controller {
    private boolean light=false;

    public class lightOn extends Event{
        public lightOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            light=true;
        }
        public String toString(){
            return "Light is on!";
        }
    }

    public class lightOff extends Event{
        public lightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light=false;
        }

        public String toString(){
            return "light is off";
        }
    }
    private boolean water=false;

    public class waterOn extends Event{
        public waterOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            water=true;
        }
        public String toString(){
            return "GreenHouse water is on!";
        }
    }

    public class waterOff extends Event{
        public waterOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            water=false;
        }

        public String toString(){
            return "GreenHouse water is off";
        }
    }
}
