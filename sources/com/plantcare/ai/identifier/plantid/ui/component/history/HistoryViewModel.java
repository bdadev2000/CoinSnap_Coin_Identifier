package com.plantcare.ai.identifier.plantid.ui.component.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/history/HistoryViewModel;", "Lmf/g;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HistoryViewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final HistoryRepository f16614d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f16615e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f16616f;

    /* renamed from: g, reason: collision with root package name */
    public final LiveData f16617g;

    public HistoryViewModel(HistoryRepository historyRepo) {
        Intrinsics.checkNotNullParameter(historyRepo, "historyRepo");
        this.f16614d = historyRepo;
        e0 e0Var = new e0();
        this.f16615e = e0Var;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        this.f16616f = e0Var;
        e0Var.postValue(0);
        this.f16617g = historyRepo.getAllHistory();
    }
}
