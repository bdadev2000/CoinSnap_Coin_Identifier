package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview;

import android.content.Context;
import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/preview/PreviewModel;", "Lmf/g;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PreviewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final PlantRepository f16686d;

    /* renamed from: e, reason: collision with root package name */
    public final HistoryRepository f16687e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f16688f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16689g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16690h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f16691i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f16692j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f16693k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f16694l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f16695m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f16696n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f16697o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f16698p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f16699q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f16700r;

    public PreviewModel(PlantRepository plantRepository, HistoryRepository historyRepository, Context context) {
        Intrinsics.checkNotNullParameter(plantRepository, "plantRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16686d = plantRepository;
        this.f16687e = historyRepository;
        this.f16688f = context;
        this.f16689g = new ArrayList();
        this.f16690h = new ArrayList();
        this.f16691i = new ArrayList();
        e0 e0Var = new e0();
        this.f16692j = e0Var;
        this.f16693k = e0Var;
        e0 e0Var2 = new e0();
        this.f16694l = e0Var2;
        this.f16695m = e0Var2;
        e0 e0Var3 = new e0();
        this.f16696n = e0Var3;
        this.f16697o = e0Var3;
        this.f16698p = new e0(new ArrayList());
        e0 e0Var4 = new e0(new ArrayList());
        this.f16699q = e0Var4;
        this.f16700r = e0Var4;
    }
}
