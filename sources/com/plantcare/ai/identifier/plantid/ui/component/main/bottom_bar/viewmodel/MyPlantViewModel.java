package com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel;

import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mf.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/main/bottom_bar/viewmodel/MyPlantViewModel;", "Lmf/g;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MyPlantViewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final PlantRepository f16662d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow f16663e;

    public MyPlantViewModel(PlantRepository plantRepo) {
        Intrinsics.checkNotNullParameter(plantRepo, "plantRepo");
        this.f16662d = plantRepo;
        e0 e0Var = new e0();
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        e0Var.postValue(0);
        this.f16663e = plantRepo.getAllRecord();
    }
}
