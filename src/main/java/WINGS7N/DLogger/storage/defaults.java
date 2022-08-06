package WINGS7N.DLogger.storage;

public interface defaults {
    int ConfigVersion = IS.CFGver;
    boolean LOG_LogInventory = true;
    boolean LOG_LogArmor = true;
    String LOG_DateFormat = "dd.MM.yy_HH.mm.ss";
    String LOG_TimeZone = "Asia/Seoul";

    boolean LagMeter_enable = true;
    String LagMeter_prefix = "[JDLogger]";

    double LagMeter_TPS_ActivateTPS = 18.5;
    String LagMeter_TPS_LowTPSMessage = "You haven't taken damage because tps = %s";
    boolean LagMeter_TPS_LowTPSPreventEntityDamage = true;
    String LagMeter_TPS_LowTPSEntityDamageMessage = "You can't damage mobs because tps = %s";

    int LagMeter_PING_ActivatePING = 400;
    String LagMeter_PING_HighPingMessage = "You haven't taken damage because your ping = %s";
    boolean LagMeter_PING_HighPingPreventEntityDamage = true;
    String LagMeter_PING_HighPingEntityDamageMessage = "You can't damage mobs because ping = %s";

    boolean DEV_DEBUG = false;
}
