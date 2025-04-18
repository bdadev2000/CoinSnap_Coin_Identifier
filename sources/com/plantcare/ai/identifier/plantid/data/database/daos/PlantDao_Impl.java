package com.plantcare.ai.identifier.plantid.data.database.daos;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.o;
import com.facebook.internal.i;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.plantcare.ai.identifier.plantid.data.database.entities.DiseaseEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.utils.Converters$toDiseaseList$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import v1.f;
import v1.f0;
import v1.g;
import v1.h;
import v1.j0;
import v1.k;
import v1.l;
import v1.p0;
import xg.a;
import z1.j;

/* loaded from: classes4.dex */
public final class PlantDao_Impl implements PlantDao {
    private final a __converters = new a();
    private final f0 __db;
    private final k __deletionAdapterOfPlantEntity;
    private final l __insertionAdapterOfPlantEntity;

    public PlantDao_Impl(@NonNull f0 f0Var) {
        this.__db = f0Var;
        this.__insertionAdapterOfPlantEntity = new l(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl.1
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Plant` (`id`,`scientificName`,`genus`,`family`,`commonNames`,`images`,`createdAt`,`treatment`,`commonDiseases`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            @Override // v1.l
            public void bind(@NonNull j jVar, @NonNull PlantEntity plantEntity) {
                jVar.m(1, plantEntity.getId());
                if (plantEntity.getScientificName() == null) {
                    jVar.o(2);
                } else {
                    jVar.i(2, plantEntity.getScientificName());
                }
                if (plantEntity.getGenus() == null) {
                    jVar.o(3);
                } else {
                    jVar.i(3, plantEntity.getGenus());
                }
                if (plantEntity.getFamily() == null) {
                    jVar.o(4);
                } else {
                    jVar.i(4, plantEntity.getFamily());
                }
                a aVar = PlantDao_Impl.this.__converters;
                List<String> commonNames = plantEntity.getCommonNames();
                aVar.getClass();
                String b3 = a.b(commonNames);
                if (b3 == null) {
                    jVar.o(5);
                } else {
                    jVar.i(5, b3);
                }
                a aVar2 = PlantDao_Impl.this.__converters;
                List<String> images = plantEntity.getImages();
                aVar2.getClass();
                String b10 = a.b(images);
                if (b10 == null) {
                    jVar.o(6);
                } else {
                    jVar.i(6, b10);
                }
                jVar.m(7, plantEntity.getCreatedAt());
                if (plantEntity.getTreatment() == null) {
                    jVar.o(8);
                } else {
                    jVar.i(8, plantEntity.getTreatment());
                }
                a aVar3 = PlantDao_Impl.this.__converters;
                List<DiseaseEntity> commonDiseases = plantEntity.getCommonDiseases();
                aVar3.getClass();
                String e2 = new n().e(commonDiseases);
                Intrinsics.checkNotNullExpressionValue(e2, "toJson(...)");
                if (e2 == null) {
                    jVar.o(9);
                } else {
                    jVar.i(9, e2);
                }
            }
        };
        this.__deletionAdapterOfPlantEntity = new k(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl.2
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "DELETE FROM `Plant` WHERE `id` = ?";
            }

            @Override // v1.k
            public void bind(@NonNull j jVar, @NonNull PlantEntity plantEntity) {
                jVar.m(1, plantEntity.getId());
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao
    public Object deleteOneRecordPlant(final PlantEntity plantEntity, Continuation<? super Unit> continuation) {
        f0 f0Var = this.__db;
        Callable<Unit> callable = new Callable<Unit>() { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl.3
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                PlantDao_Impl.this.__db.beginTransaction();
                try {
                    PlantDao_Impl.this.__deletionAdapterOfPlantEntity.handle(plantEntity);
                    PlantDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    PlantDao_Impl.this.__db.endTransaction();
                }
            }
        };
        if (f0Var.isOpenInternal() && f0Var.inTransaction()) {
            return callable.call();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.w(continuation.get$context().get(p0.f25930b));
        return BuildersKt.withContext(i.x(f0Var), new g(callable, null), continuation);
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao
    public Flow<List<PlantEntity>> getAllRecord() {
        final j0 j3 = j0.j(0, "SELECT * FROM PLANT order by createdAt DESC");
        return FlowKt.flow(new f(false, this.__db, new String[]{"PLANT"}, new Callable<List<PlantEntity>>() { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl.4
            public void finalize() {
                j3.release();
            }

            @Override // java.util.concurrent.Callable
            @Nullable
            public List<PlantEntity> call() throws Exception {
                String string;
                int i10;
                AnonymousClass4 anonymousClass4 = this;
                Cursor G = i.G(PlantDao_Impl.this.__db, j3);
                try {
                    int j10 = o.j(G, "id");
                    int j11 = o.j(G, "scientificName");
                    int j12 = o.j(G, "genus");
                    int j13 = o.j(G, "family");
                    int j14 = o.j(G, "commonNames");
                    int j15 = o.j(G, "images");
                    int j16 = o.j(G, "createdAt");
                    int j17 = o.j(G, "treatment");
                    int j18 = o.j(G, "commonDiseases");
                    ArrayList arrayList = new ArrayList(G.getCount());
                    while (G.moveToNext()) {
                        long j19 = G.getLong(j10);
                        String string2 = G.isNull(j11) ? null : G.getString(j11);
                        String string3 = G.isNull(j12) ? null : G.getString(j12);
                        String string4 = G.isNull(j13) ? null : G.getString(j13);
                        String string5 = G.isNull(j14) ? null : G.getString(j14);
                        PlantDao_Impl.this.__converters.getClass();
                        List d10 = a.d(string5);
                        if (G.isNull(j15)) {
                            i10 = j10;
                            string = null;
                        } else {
                            string = G.getString(j15);
                            i10 = j10;
                        }
                        PlantDao_Impl.this.__converters.getClass();
                        List d11 = a.d(string);
                        long j20 = G.getLong(j16);
                        String string6 = G.isNull(j17) ? null : G.getString(j17);
                        String string7 = G.isNull(j18) ? null : G.getString(j18);
                        PlantDao_Impl.this.__converters.getClass();
                        int i11 = j11;
                        Object b3 = new n().b(string7, new TypeToken(new Converters$toDiseaseList$1().f12123b));
                        Intrinsics.checkNotNullExpressionValue(b3, "fromJson(...)");
                        arrayList.add(new PlantEntity(j19, string2, string3, string4, d10, d11, j20, string6, (List) b3));
                        anonymousClass4 = this;
                        j10 = i10;
                        j11 = i11;
                    }
                    return arrayList;
                } finally {
                    G.close();
                }
            }
        }, null));
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao
    public Object isPlantExists(String str, Continuation<? super Integer> continuation) {
        Job launch$default;
        final j0 j3 = j0.j(1, "SELECT COUNT(*) FROM PLANT WHERE scientificName = ?");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        f0 f0Var = this.__db;
        Callable<Integer> callable = new Callable<Integer>() { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @NonNull
            public Integer call() throws Exception {
                Integer num;
                Cursor G = i.G(PlantDao_Impl.this.__db, j3);
                try {
                    if (G.moveToFirst() && !G.isNull(0)) {
                        num = Integer.valueOf(G.getInt(0));
                        return num;
                    }
                    num = null;
                    return num;
                } finally {
                    G.close();
                    j3.release();
                }
            }
        };
        if (f0Var.isOpenInternal() && f0Var.inTransaction()) {
            return callable.call();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.w(continuation.get$context().get(p0.f25930b));
        CoroutineDispatcher w10 = i.w(f0Var);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, w10, null, new v1.i(callable, cancellableContinuationImpl, null), 2, null);
        cancellableContinuationImpl.invokeOnCancellation(new h(cancellationSignal, launch$default));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
            return result;
        }
        return result;
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao
    public void saveRecord(PlantEntity plantEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPlantEntity.insert(plantEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
