package cn.itcast.day10.demo07;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }
    public void useDevice(USB usb){
    usb.open();
    if(usb instanceof Mouse){
        Mouse mouse=(Mouse) usb;
        mouse.clk();
    }
    usb.close();
    }
}
