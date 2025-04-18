package com.plantcare.ai.identifier.plantid.data.database.daos;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import com.facebook.appevents.o;
import com.facebook.internal.i;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.plantcare.ai.identifier.plantid.data.database.entities.DiseaseEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.utils.Converters$toDiseaseList$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import v1.f0;
import v1.j0;
import v1.k;
import v1.l;
import xg.a;
import z1.j;

/* loaded from: classes4.dex */
public final class HistoryPlantDao_Impl implements HistoryPlantDao {
    private final a __converters = new a();
    private final f0 __db;
    private final k __deletionAdapterOfHistoryEntity;
    private final l __insertionAdapterOfHistoryEntity;

    public HistoryPlantDao_Impl(@NonNull f0 f0Var) {
        this.__db = f0Var;
        this.__insertionAdapterOfHistoryEntity = new l(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao_Impl.1
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "INSERT OR ABORT INTO `HISTORY_SEARCH` (`id`,`scientificName`,`genus`,`family`,`commonNames`,`images`,`createdAt`,`treatment`,`diseaseName`,`diseaseDes`,`type`,`commonDiseases`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // v1.l
            public void bind(@NonNull j jVar, @NonNull HistoryEntity historyEntity) {
                jVar.m(1, historyEntity.getId());
                if (historyEntity.getScientificName() == null) {
                    jVar.o(2);
                } else {
                    jVar.i(2, historyEntity.getScientificName());
                }
                if (historyEntity.getGenus() == null) {
                    jVar.o(3);
                } else {
                    jVar.i(3, historyEntity.getGenus());
                }
                if (historyEntity.getFamily() == null) {
                    jVar.o(4);
                } else {
                    jVar.i(4, historyEntity.getFamily());
                }
                a aVar = HistoryPlantDao_Impl.this.__converters;
                List<String> commonNames = historyEntity.getCommonNames();
                aVar.getClass();
                String b3 = a.b(commonNames);
                if (b3 == null) {
                    jVar.o(5);
                } else {
                    jVar.i(5, b3);
                }
                a aVar2 = HistoryPlantDao_Impl.this.__converters;
                List<String> images = historyEntity.getImages();
                aVar2.getClass();
                String b10 = a.b(images);
                if (b10 == null) {
                    jVar.o(6);
                } else {
                    jVar.i(6, b10);
                }
                jVar.m(7, historyEntity.getCreatedAt());
                if (historyEntity.getTreatment() == null) {
                    jVar.o(8);
                } else {
                    jVar.i(8, historyEntity.getTreatment());
                }
                if (historyEntity.getDiseaseName() == null) {
                    jVar.o(9);
                } else {
                    jVar.i(9, historyEntity.getDiseaseName());
                }
                if (historyEntity.getDiseaseDes() == null) {
                    jVar.o(10);
                } else {
                    jVar.i(10, historyEntity.getDiseaseDes());
                }
                jVar.m(11, historyEntity.getType());
                a aVar3 = HistoryPlantDao_Impl.this.__converters;
                List<DiseaseEntity> commonDiseases = historyEntity.getCommonDiseases();
                aVar3.getClass();
                String e2 = new n().e(commonDiseases);
                Intrinsics.checkNotNullExpressionValue(e2, "toJson(...)");
                if (e2 == null) {
                    jVar.o(12);
                } else {
                    jVar.i(12, e2);
                }
            }
        };
        this.__deletionAdapterOfHistoryEntity = new k(f0Var) { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao_Impl.2
            @Override // v1.n0
            @NonNull
            public String createQuery() {
                return "DELETE FROM `HISTORY_SEARCH` WHERE `id` = ?";
            }

            @Override // v1.k
            public void bind(@NonNull j jVar, @NonNull HistoryEntity historyEntity) {
                jVar.m(1, historyEntity.getId());
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao
    public void deleteListRecordRemind(List<HistoryEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfHistoryEntity.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao
    public LiveData<List<HistoryEntity>> getAllHistory() {
        final j0 j3 = j0.j(0, "SELECT * FROM HISTORY_SEARCH ORDER BY createdAt DESC");
        return this.__db.getInvalidationTracker().b(new String[]{"HISTORY_SEARCH"}, new Callable<List<HistoryEntity>>() { // from class: com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao_Impl.3
            public void finalize() {
                j3.release();
            }

            @Override // java.util.concurrent.Callable
            @Nullable
            public List<HistoryEntity> call() throws Exception {
                String string;
                int i10;
                AnonymousClass3 anonymousClass3 = this;
                Cursor G = i.G(HistoryPlantDao_Impl.this.__db, j3);
                try {
                    int j10 = o.j(G, "id");
                    int j11 = o.j(G, "scientificName");
                    int j12 = o.j(G, "genus");
                    int j13 = o.j(G, "family");
                    int j14 = o.j(G, "commonNames");
                    int j15 = o.j(G, "images");
                    int j16 = o.j(G, "createdAt");
                    int j17 = o.j(G, "treatment");
                    int j18 = o.j(G, "diseaseName");
                    int j19 = o.j(G, "diseaseDes");
                    int j20 = o.j(G, "type");
                    int j21 = o.j(G, "commonDiseases");
                    ArrayList arrayList = new ArrayList(G.getCount());
                    while (G.moveToNext()) {
                        long j22 = G.getLong(j10);
                        String str = null;
                        String string2 = G.isNull(j11) ? null : G.getString(j11);
                        String string3 = G.isNull(j12) ? null : G.getString(j12);
                        String string4 = G.isNull(j13) ? null : G.getString(j13);
                        if (G.isNull(j14)) {
                            i10 = j10;
                            string = null;
                        } else {
                            string = G.getString(j14);
                            i10 = j10;
                        }
                        HistoryPlantDao_Impl.this.__converters.getClass();
                        List d10 = a.d(string);
                        String string5 = G.isNull(j15) ? null : G.getString(j15);
                        HistoryPlantDao_Impl.this.__converters.getClass();
                        List d11 = a.d(string5);
                        long j23 = G.getLong(j16);
                        String string6 = G.isNull(j17) ? null : G.getString(j17);
                        String string7 = G.isNull(j18) ? null : G.getString(j18);
                        String string8 = G.isNull(j19) ? null : G.getString(j19);
                        int i11 = G.getInt(j20);
                        if (!G.isNull(j21)) {
                            str = G.getString(j21);
                        }
                        HistoryPlantDao_Impl.this.__converters.getClass();
                        int i12 = j11;
                        Object b3 = new n().b(str, new TypeToken(new Converters$toDiseaseList$1().f12123b));
                        Intrinsics.checkNotNullExpressionValue(b3, "fromJson(...)");
                        arrayList.add(new HistoryEntity(j22, string2, string3, string4, d10, d11, j23, string6, string7, string8, i11, (List) b3));
                        anonymousClass3 = this;
                        j10 = i10;
                        j11 = i12;
                    }
                    return arrayList;
                } finally {
                    G.close();
                }
            }
        });
    }

    @Override // com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao
    public void saveHistory(HistoryEntity historyEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfHistoryEntity.insert(historyEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
