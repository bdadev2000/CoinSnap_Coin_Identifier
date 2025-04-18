package com.plantcare.ai.identifier.plantid.ui.component.ring;

import androidx.lifecycle.e;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mf.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/ring/NotifyViewModel;", "Lmf/g;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotifyViewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final DateFormat f16718d;

    /* renamed from: e, reason: collision with root package name */
    public final DateFormat f16719e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f16720f;

    /* renamed from: g, reason: collision with root package name */
    public final StateFlow f16721g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f16722h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f16723i;

    public NotifyViewModel() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        Intrinsics.checkNotNullExpressionValue(dateInstance, "getDateInstance(...)");
        this.f16718d = dateInstance;
        DateFormat timeInstance = DateFormat.getTimeInstance(3);
        Intrinsics.checkNotNullExpressionValue(timeInstance, "getTimeInstance(...)");
        this.f16719e = timeInstance;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(timeInstance.format(new Date()));
        this.f16720f = MutableStateFlow;
        this.f16721g = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(dateInstance.format(new Date()));
        this.f16722h = MutableStateFlow2;
        this.f16723i = FlowKt.asStateFlow(MutableStateFlow2);
        Intrinsics.checkNotNullParameter(this, "<this>");
        CoroutineScope coroutineScope = (CoroutineScope) getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (coroutineScope == null) {
            Object tagIfAbsent = setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new e(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate())));
            Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
            coroutineScope = (CoroutineScope) tagIfAbsent;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ug.g(this, null), 3, null);
    }
}
