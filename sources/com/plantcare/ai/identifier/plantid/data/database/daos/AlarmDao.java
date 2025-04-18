package com.plantcare.ai.identifier.plantid.data.database.daos;

import androidx.lifecycle.LiveData;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH'J\b\u0010\u0012\u001a\u00020\u0004H'J\b\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0014\u001a\u00020\u0002H'J\b\u0010\u0015\u001a\u00020\u0002H'¨\u0006\u0016"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/daos/AlarmDao;", "", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/AlarmEntity;", "entity", "", "saveRecordAlarm", "Landroidx/lifecycle/LiveData;", "", "getAllRecordAlarm", "getAllRecordAlarmTypeList", "getAllRecordLabelIsNotifyDailyType", "", "id", "searchAlarmById", "updateRecord", "", "records", "deleteListRecordRemind", "deleteAlarmTypeNotifyDaily", "deleteAlarmTypeNotifyFullScreen", "getAlarmNotifyTypeDaily", "getAlarmNotifyTypeFullScreen", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AlarmDao {
    void deleteAlarmTypeNotifyDaily();

    void deleteAlarmTypeNotifyFullScreen();

    void deleteListRecordRemind(List<AlarmEntity> records);

    AlarmEntity getAlarmNotifyTypeDaily();

    AlarmEntity getAlarmNotifyTypeFullScreen();

    LiveData<List<AlarmEntity>> getAllRecordAlarm();

    List<AlarmEntity> getAllRecordAlarmTypeList();

    List<AlarmEntity> getAllRecordLabelIsNotifyDailyType();

    void saveRecordAlarm(AlarmEntity entity);

    AlarmEntity searchAlarmById(long id2);

    void updateRecord(AlarmEntity entity);
}
