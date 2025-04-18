package com.plantcare.ai.identifier.plantid.data.database.daos;

import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\bH'J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/daos/PlantDao;", "", "deleteOneRecordPlant", "", "plantEntity", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/PlantEntity;", "(Lcom/plantcare/ai/identifier/plantid/data/database/entities/PlantEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRecord", "Lkotlinx/coroutines/flow/Flow;", "", "isPlantExists", "", "scientificName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRecord", "record", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PlantDao {
    Object deleteOneRecordPlant(PlantEntity plantEntity, Continuation<? super Unit> continuation);

    Flow<List<PlantEntity>> getAllRecord();

    Object isPlantExists(String str, Continuation<? super Integer> continuation);

    void saveRecord(PlantEntity record);
}
