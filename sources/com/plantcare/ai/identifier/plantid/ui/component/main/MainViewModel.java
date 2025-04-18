package com.plantcare.ai.identifier.plantid.ui.component.main;

import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.data.network.repository.LocationRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.WeatherRepository;
import com.plantcare.ai.identifier.plantid.domains.WeatherDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mf.g;
import xg.e;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/main/MainViewModel;", "Lmf/g;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/MainViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/plantcare/ai/identifier/plantid/ui/component/main/MainViewModel\n*L\n25#1:70\n25#1:71,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MainViewModel extends g {

    /* renamed from: d, reason: collision with root package name */
    public final WeatherRepository f16652d;

    /* renamed from: e, reason: collision with root package name */
    public final LocationRepository f16653e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16654f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f16655g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f16656h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f16657i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f16658j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f16659k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f16660l;

    public MainViewModel(WeatherRepository weatherRepo, LocationRepository locationRepo) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(weatherRepo, "weatherRepo");
        Intrinsics.checkNotNullParameter(locationRepo, "locationRepo");
        this.f16652d = weatherRepo;
        this.f16653e = locationRepo;
        List<Pair> zip = CollectionsKt.zip(e.a, e.f27675b);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Pair pair : zip) {
            arrayList.add(new WeatherDomain(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue()));
        }
        this.f16654f = arrayList;
        e0 e0Var = new e0();
        this.f16655g = e0Var;
        this.f16656h = e0Var;
        e0 e0Var2 = new e0();
        this.f16657i = e0Var2;
        this.f16658j = e0Var2;
        e0 e0Var3 = new e0();
        this.f16659k = e0Var3;
        this.f16660l = e0Var3;
    }
}
