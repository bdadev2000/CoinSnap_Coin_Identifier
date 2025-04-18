package com.plantcare.ai.identifier.plantid.ui.component.ring;

import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mf.g;
import ug.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/ring/RingViewModel;", "Lmf/g;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RingViewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmRepository f16731d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f16732e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f16733f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f16734g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f16735h;

    public RingViewModel(AlarmRepository alarmRepo) {
        Intrinsics.checkNotNullParameter(alarmRepo, "alarmRepo");
        this.f16731d = alarmRepo;
        e0 e0Var = new e0();
        this.f16732e = e0Var;
        this.f16733f = e0Var;
        e0 e0Var2 = new e0();
        this.f16734g = e0Var2;
        this.f16735h = e0Var2;
    }

    public final void a(AlarmEntity record, Function0 onEventInMainThread) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(onEventInMainThread, "onEventInMainThread");
        BuildersKt__Builders_commonKt.launch$default(this.f22242c, null, null, new p(this, record, onEventInMainThread, null), 3, null);
    }
}
