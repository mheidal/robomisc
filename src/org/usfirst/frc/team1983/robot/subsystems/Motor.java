package org.usfirst.frc.team1983.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.CANSpeedController;
import org.usfirst.frc.team1983.robot.settings.Constants;

public class Motor {
    Talon m_talon;
    int m_port;

    public Motor(int port, boolean reversed) {
        m_talon = new Talon(port);
        m_talon.setInverted(reversed);

        m_port = port;
    }

    public void set(double value) {
        m_talon.set(value);
    }
}