package xg;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.DiseaseEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomainDelete;
import com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d {
    public static final AlarmEntity a(AlarmDomain alarmDomain) {
        Intrinsics.checkNotNullParameter(alarmDomain, "<this>");
        AlarmEntity alarmEntity = new AlarmEntity();
        alarmEntity.setId(alarmDomain.getId());
        alarmEntity.setTime(alarmDomain.getTime());
        alarmEntity.setLabel(alarmDomain.getLabel());
        alarmEntity.setDescription(alarmDomain.getDescription());
        alarmEntity.setDay(1, alarmDomain.getAllDays().get(1));
        alarmEntity.setDay(2, alarmDomain.getAllDays().get(2));
        alarmEntity.setDay(3, alarmDomain.getAllDays().get(3));
        alarmEntity.setDay(4, alarmDomain.getAllDays().get(4));
        alarmEntity.setDay(5, alarmDomain.getAllDays().get(5));
        alarmEntity.setDay(6, alarmDomain.getAllDays().get(6));
        alarmEntity.setDay(7, alarmDomain.getAllDays().get(7));
        alarmEntity.setSoundRes(alarmDomain.getSoundRes());
        alarmEntity.setIsEnabled(alarmDomain.getIsEnabled());
        alarmEntity.setIsVibration(alarmDomain.getIsVibration());
        return alarmEntity;
    }

    public static final AlarmEntity b(AlarmDomainDelete alarmDomainDelete) {
        Intrinsics.checkNotNullParameter(alarmDomainDelete, "<this>");
        AlarmEntity alarmEntity = new AlarmEntity();
        alarmEntity.setId(alarmDomainDelete.getId());
        alarmEntity.setLabel(alarmDomainDelete.getLabel());
        alarmEntity.setDescription(alarmDomainDelete.getDescription());
        alarmEntity.setDay(1, alarmDomainDelete.getAllDays().get(1));
        alarmEntity.setDay(2, alarmDomainDelete.getAllDays().get(2));
        alarmEntity.setDay(3, alarmDomainDelete.getAllDays().get(3));
        alarmEntity.setDay(4, alarmDomainDelete.getAllDays().get(4));
        alarmEntity.setDay(5, alarmDomainDelete.getAllDays().get(5));
        alarmEntity.setDay(6, alarmDomainDelete.getAllDays().get(6));
        alarmEntity.setDay(7, alarmDomainDelete.getAllDays().get(7));
        alarmEntity.setSoundRes(alarmDomainDelete.getSoundRes());
        alarmEntity.setIsEnabled(alarmDomainDelete.getIsEnabled());
        alarmEntity.setIsVibration(alarmDomainDelete.getIsVibration());
        return alarmEntity;
    }

    public static final ArrayList c(List list) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DiseaseEntity> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (DiseaseEntity diseaseEntity : list2) {
            Intrinsics.checkNotNullParameter(diseaseEntity, "<this>");
            arrayList.add(new DiseasePlantDomain(diseaseEntity.getName(), diseaseEntity.getDescription()));
        }
        return arrayList;
    }

    public static final ArrayList d(List list) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DiseasePlantDomain> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (DiseasePlantDomain diseasePlantDomain : list2) {
            Intrinsics.checkNotNullParameter(diseasePlantDomain, "<this>");
            arrayList.add(new DiseaseEntity(0L, diseasePlantDomain.getName(), diseasePlantDomain.getDescription(), 1, null));
        }
        return arrayList;
    }

    public static final ArrayList e(ArrayList arrayList) {
        int collectionSizeOrDefault;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HistoryEntity historyEntity = (HistoryEntity) it.next();
            Intrinsics.checkNotNullParameter(historyEntity, str);
            arrayList2.add(new HistoryDomain(historyEntity.getId(), historyEntity.getScientificName(), historyEntity.getGenus(), historyEntity.getFamily(), historyEntity.getCommonNames(), historyEntity.getImages(), historyEntity.getCreatedAt(), false, historyEntity.getTreatment(), new DiseasePlantDomain(historyEntity.getDiseaseName(), historyEntity.getDiseaseDes()), historyEntity.getType() - 1, c(historyEntity.getCommonDiseases()), 128, null));
            it = it;
            str = str;
        }
        return arrayList2;
    }

    public static final ArrayList f(ArrayList arrayList) {
        int collectionSizeOrDefault;
        String str;
        String description;
        String name;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HistoryDomain historyDomain = (HistoryDomain) it.next();
            Intrinsics.checkNotNullParameter(historyDomain, str2);
            long id2 = historyDomain.getId();
            String scientificName = historyDomain.getScientificName();
            String genus = historyDomain.getGenus();
            String family = historyDomain.getFamily();
            List<String> commonNames = historyDomain.getCommonNames();
            List<String> images = historyDomain.getImages();
            long createdAt = historyDomain.getCreatedAt();
            String treatment = historyDomain.getTreatment();
            DiseasePlantDomain diseases = historyDomain.getDiseases();
            String str3 = "";
            if (diseases == null || (name = diseases.getName()) == null) {
                str = "";
            } else {
                str = name;
            }
            DiseasePlantDomain diseases2 = historyDomain.getDiseases();
            if (diseases2 != null && (description = diseases2.getDescription()) != null) {
                str3 = description;
            }
            arrayList2.add(new HistoryEntity(id2, scientificName, genus, family, commonNames, images, createdAt, treatment, str, str3, historyDomain.getType(), d(historyDomain.getCommonDiseases())));
            str2 = str2;
        }
        return arrayList2;
    }

    public static final PlantEntity g(PlantDomain plantDomain) {
        Intrinsics.checkNotNullParameter(plantDomain, "<this>");
        return new PlantEntity(plantDomain.getId(), plantDomain.getScientificName(), plantDomain.getGenus(), plantDomain.getFamily(), plantDomain.getCommonNames(), plantDomain.getImages(), 0L, plantDomain.getTreatment(), d(plantDomain.getCommonDiseases()), 64, null);
    }
}
