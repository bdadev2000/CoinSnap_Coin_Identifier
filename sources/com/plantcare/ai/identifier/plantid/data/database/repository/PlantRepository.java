package com.plantcare.ai.identifier.plantid.data.database.repository;

import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao;
import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/repository/PlantRepository;", "", "dao", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/PlantDao;", "(Lcom/plantcare/ai/identifier/plantid/data/database/daos/PlantDao;)V", "deleteOneRecordPlant", "", "plant", "Lcom/plantcare/ai/identifier/plantid/data/database/entities/PlantEntity;", "(Lcom/plantcare/ai/identifier/plantid/data/database/entities/PlantEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRecord", "Lkotlinx/coroutines/flow/Flow;", "", "isPlantExists", "", "scientificName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRecord", "record", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlantRepository {
    private final PlantDao dao;

    public PlantRepository(PlantDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final Object deleteOneRecordPlant(PlantEntity plantEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new PlantRepository$deleteOneRecordPlant$2(this, plantEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Flow<List<PlantEntity>> getAllRecord() {
        return this.dao.getAllRecord();
    }

    public final Object isPlantExists(String str, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PlantRepository$isPlantExists$2(this, str, null), continuation);
    }

    public final Object saveRecord(PlantEntity plantEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new PlantRepository$saveRecord$2(this, plantEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
