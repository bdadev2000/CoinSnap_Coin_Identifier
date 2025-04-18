package og;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.plantcare.ai.identifier.plantid.data.database.entities.DiseaseEntity;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewIdentifyActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.di.DiResultActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.healthy.HealthyActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.g0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewIdentifyActivity f23321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PreviewIdentifyActivity previewIdentifyActivity) {
        super(1);
        this.f23321b = previewIdentifyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseasePlantDto;
        Class cls;
        String str;
        String str2;
        String str3;
        List<String> arrayList;
        List<String> arrayList2;
        String str4;
        String str5;
        String str6;
        List emptyList;
        String str7;
        String str8;
        String str9;
        List<String> arrayList3;
        List<String> arrayList4;
        List emptyList2;
        List<ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto> commonDiseases;
        int collectionSizeOrDefault;
        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseases;
        String treatment;
        String family;
        String genus;
        String scientificName;
        List<ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto> commonDiseases2;
        int collectionSizeOrDefault2;
        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseases2;
        String description;
        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseases3;
        String name;
        String treatment2;
        String family2;
        String genus2;
        String scientificName2;
        ResponsePlantDto responsePlantDto = (ResponsePlantDto) obj;
        boolean z11 = true;
        if (responsePlantDto == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        PreviewIdentifyActivity previewIdentifyActivity = this.f23321b;
        if (z10) {
            int i10 = PreviewIdentifyActivity.f16681n;
            sf.g gVar = previewIdentifyActivity.f16683k;
            if (gVar != null) {
                gVar.show();
                Unit unit = Unit.INSTANCE;
            }
        } else {
            Intrinsics.checkNotNull(responsePlantDto);
            if (responsePlantDto.getData() == null) {
                z11 = false;
            }
            if (z11) {
                DiseasePlantDomain diseasePlantDomain = null;
                if (previewIdentifyActivity.getIntent().getIntExtra("KEY_FLAG_ID_OR_DI", 0) == 0) {
                    cls = SearchPlantResultActivity.class;
                } else {
                    ResponsePlantDto.DataResponsePlantDto data = responsePlantDto.getData();
                    if (data != null) {
                        diseasePlantDto = data.getDiseases();
                    } else {
                        diseasePlantDto = null;
                    }
                    if (diseasePlantDto != null) {
                        cls = DiResultActivity.class;
                    } else {
                        cls = HealthyActivity.class;
                    }
                }
                PreviewModel I = previewIdentifyActivity.I();
                int intExtra = previewIdentifyActivity.getIntent().getIntExtra("KEY_FLAG_ID_OR_DI", 0);
                Intrinsics.checkNotNullParameter(responsePlantDto, "<this>");
                ResponsePlantDto.DataResponsePlantDto data2 = responsePlantDto.getData();
                String str10 = "";
                if (data2 == null || (scientificName2 = data2.getScientificName()) == null) {
                    str = "";
                } else {
                    str = scientificName2;
                }
                ResponsePlantDto.DataResponsePlantDto data3 = responsePlantDto.getData();
                if (data3 == null || (genus2 = data3.getGenus()) == null) {
                    str2 = "";
                } else {
                    str2 = genus2;
                }
                ResponsePlantDto.DataResponsePlantDto data4 = responsePlantDto.getData();
                if (data4 == null || (family2 = data4.getFamily()) == null) {
                    str3 = "";
                } else {
                    str3 = family2;
                }
                ResponsePlantDto.DataResponsePlantDto data5 = responsePlantDto.getData();
                if (data5 == null || (arrayList = data5.getCommonNames()) == null) {
                    arrayList = new ArrayList<>();
                }
                List<String> list = arrayList;
                ResponsePlantDto.DataResponsePlantDto data6 = responsePlantDto.getData();
                if (data6 == null || (arrayList2 = data6.getImages()) == null) {
                    arrayList2 = new ArrayList<>();
                }
                List<String> list2 = arrayList2;
                ResponsePlantDto.DataResponsePlantDto data7 = responsePlantDto.getData();
                if (data7 == null || (treatment2 = data7.getTreatment()) == null) {
                    str4 = "";
                } else {
                    str4 = treatment2;
                }
                ResponsePlantDto.DataResponsePlantDto data8 = responsePlantDto.getData();
                if (data8 == null || (diseases3 = data8.getDiseases()) == null || (name = diseases3.getName()) == null) {
                    str5 = "";
                } else {
                    str5 = name;
                }
                ResponsePlantDto.DataResponsePlantDto data9 = responsePlantDto.getData();
                if (data9 == null || (diseases2 = data9.getDiseases()) == null || (description = diseases2.getDescription()) == null) {
                    str6 = "";
                } else {
                    str6 = description;
                }
                ResponsePlantDto.DataResponsePlantDto data10 = responsePlantDto.getData();
                if (data10 != null && (commonDiseases2 = data10.getCommonDiseases()) != null) {
                    Intrinsics.checkNotNullParameter(commonDiseases2, "<this>");
                    List<ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto> list3 = commonDiseases2;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
                    for (ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseasePlantDto2 : list3) {
                        Intrinsics.checkNotNullParameter(diseasePlantDto2, "<this>");
                        arrayList5.add(new DiseaseEntity(0L, diseasePlantDto2.getName(), diseasePlantDto2.getDescription(), 1, null));
                    }
                    emptyList = arrayList5;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                HistoryEntity history = new HistoryEntity(0L, str, str2, str3, list, list2, 0L, str4, str5, str6, intExtra, emptyList, 64, null);
                I.getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new i(I, history, null), 3, null);
                Bundle bundle = new Bundle();
                Intrinsics.checkNotNullParameter(responsePlantDto, "<this>");
                ResponsePlantDto.DataResponsePlantDto data11 = responsePlantDto.getData();
                if (data11 == null || (scientificName = data11.getScientificName()) == null) {
                    str7 = "";
                } else {
                    str7 = scientificName;
                }
                ResponsePlantDto.DataResponsePlantDto data12 = responsePlantDto.getData();
                if (data12 == null || (genus = data12.getGenus()) == null) {
                    str8 = "";
                } else {
                    str8 = genus;
                }
                ResponsePlantDto.DataResponsePlantDto data13 = responsePlantDto.getData();
                if (data13 == null || (family = data13.getFamily()) == null) {
                    str9 = "";
                } else {
                    str9 = family;
                }
                ResponsePlantDto.DataResponsePlantDto data14 = responsePlantDto.getData();
                if (data14 == null || (arrayList3 = data14.getCommonNames()) == null) {
                    arrayList3 = new ArrayList<>();
                }
                List<String> list4 = arrayList3;
                ResponsePlantDto.DataResponsePlantDto data15 = responsePlantDto.getData();
                if (data15 == null || (arrayList4 = data15.getImages()) == null) {
                    arrayList4 = new ArrayList<>();
                }
                List<String> list5 = arrayList4;
                ResponsePlantDto.DataResponsePlantDto data16 = responsePlantDto.getData();
                if (data16 != null && (treatment = data16.getTreatment()) != null) {
                    str10 = treatment;
                }
                ResponsePlantDto.DataResponsePlantDto data17 = responsePlantDto.getData();
                if (data17 != null && (diseases = data17.getDiseases()) != null) {
                    Intrinsics.checkNotNullParameter(diseases, "<this>");
                    diseasePlantDomain = new DiseasePlantDomain(diseases.getName(), diseases.getDescription());
                }
                ResponsePlantDto.DataResponsePlantDto data18 = responsePlantDto.getData();
                if (data18 != null && (commonDiseases = data18.getCommonDiseases()) != null) {
                    Intrinsics.checkNotNullParameter(commonDiseases, "<this>");
                    List<ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto> list6 = commonDiseases;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10);
                    ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault);
                    for (Iterator it = list6.iterator(); it.hasNext(); it = it) {
                        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseasePlantDto3 = (ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto) it.next();
                        Intrinsics.checkNotNullParameter(diseasePlantDto3, "<this>");
                        arrayList6.add(new DiseasePlantDomain(diseasePlantDto3.getName(), diseasePlantDto3.getDescription()));
                    }
                    emptyList2 = arrayList6;
                } else {
                    emptyList2 = CollectionsKt.emptyList();
                }
                bundle.putSerializable("KEY_RESULT_SEARCH", new PlantDomain(0L, str7, str8, str9, list4, list5, str10, diseasePlantDomain, emptyList2, 1, null));
                Intent intent = new Intent(previewIdentifyActivity, (Class<?>) cls);
                intent.putExtras(bundle);
                previewIdentifyActivity.startActivity(intent);
                previewIdentifyActivity.finish();
            } else {
                int i11 = PreviewIdentifyActivity.f16681n;
                LinearLayout layoutResultNotFound = ((g0) previewIdentifyActivity.n()).A;
                Intrinsics.checkNotNullExpressionValue(layoutResultNotFound, "layoutResultNotFound");
                com.bumptech.glide.e.V(layoutResultNotFound);
            }
        }
        return Unit.INSTANCE;
    }
}
