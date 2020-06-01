package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_test{

  public static int modeNum = 1;

  public static void main(String[] args) {

    TimeKeeping_Pane timeKeepingPane = new TimeKeeping_Pane();
    Alarm_Pane alarmPane = new Alarm_Pane();
    Timer_Pane timerPane = new Timer_Pane();
    Stopwatch_Pane swPane = new Stopwatch_Pane();
    WorldTime_Pane wtPane = new WorldTime_Pane();
    CalorieCheck_Pane ccPane = new CalorieCheck_Pane();

    watchGUI mainGUI = new watchGUI(ccPane); //initialized with TimeKeeping mode

    mainGUI.getModeB().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        switch(modeNum){
          case 1:
            switchPanel(mainGUI, timerPane);
            break;
          case 2:
            switchPanel(mainGUI, alarmPane);
            break;
          case 3:
            switchPanel(mainGUI, swPane);
            break;
          case 4:
            switchPanel(mainGUI, timeKeepingPane);
            break;
          default:
            break;
        }
        if(modeNum != 4)modeNum++;
        else modeNum = 1;
      }
    });

  }

  public static void switchPanel(watchGUI mainGUI, JPanel newPanel){
    mainGUI.getFramePane().remove(mainGUI.getWatchBodyPane());
    mainGUI.setWatchBodyPane(newPanel);
    mainGUI.getFramePane().add(mainGUI.getWatchBodyPane());
    mainGUI.revalidate();
    mainGUI.repaint();
  }
}
