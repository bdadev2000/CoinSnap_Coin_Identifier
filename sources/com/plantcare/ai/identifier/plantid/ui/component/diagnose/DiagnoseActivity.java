package com.plantcare.ai.identifier.plantid.ui.component.diagnose;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.c;
import androidx.appcompat.widget.w2;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.plantcare.ai.identifier.plantid.R;
import f.d;
import java.util.List;
import kf.e;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pf.b;
import pf.f;
import qf.a;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/diagnose/DiagnoseActivity;", "Lmf/a;", "Lkf/e;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDiagnoseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnoseActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/diagnose/DiagnoseActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1045#2:211\n766#2:212\n857#2,2:213\n1045#2:215\n*S KotlinDebug\n*F\n+ 1 DiagnoseActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/diagnose/DiagnoseActivity\n*L\n108#1:211\n165#1:212\n165#1:213,2\n181#1:215\n*E\n"})
/* loaded from: classes4.dex */
public final class DiagnoseActivity extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16607n = 0;

    /* renamed from: j, reason: collision with root package name */
    public a f16608j;

    /* renamed from: k, reason: collision with root package name */
    public final List f16609k;

    /* renamed from: l, reason: collision with root package name */
    public int f16610l;

    /* renamed from: m, reason: collision with root package name */
    public final c f16611m;

    public DiagnoseActivity() {
        super(0);
        this.f16609k = CollectionsKt.mutableListOf(new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease1), Integer.valueOf(R.drawable.img_2_disease1), Integer.valueOf(R.drawable.img_3_disease1)}), R.string.diseaseName_1, R.string.diseaseSymptoms_1, R.string.diseaseCause_1, R.string.diseaseManagement_1), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease2), Integer.valueOf(R.drawable.img_2_disease2), Integer.valueOf(R.drawable.img_3_disease2)}), R.string.diseaseName_2, R.string.diseaseSymptoms_2, R.string.diseaseCause_2, R.string.diseaseManagement_2), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease3), Integer.valueOf(R.drawable.img_2_disease3), Integer.valueOf(R.drawable.img_3_disease3)}), R.string.diseaseName_3, R.string.diseaseSymptoms_3, R.string.diseaseCause_3, R.string.diseaseManagement_3), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease4), Integer.valueOf(R.drawable.img_2_disease4), Integer.valueOf(R.drawable.img_3_disease4)}), R.string.diseaseName_4, R.string.diseaseSymptoms_4, R.string.diseaseCause_4, R.string.diseaseManagement_4), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease5), Integer.valueOf(R.drawable.img_2_disease5), Integer.valueOf(R.drawable.img_3_disease5)}), R.string.diseaseName_5, R.string.diseaseSymptoms_5, R.string.diseaseCause_5, R.string.diseaseManagement_5), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease6), Integer.valueOf(R.drawable.img_2_disease6), Integer.valueOf(R.drawable.img_3_disease6)}), R.string.diseaseName_6, R.string.diseaseSymptoms_6, R.string.diseaseCause_6, R.string.diseaseManagement_6), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease7), Integer.valueOf(R.drawable.img_2_disease7), Integer.valueOf(R.drawable.img_3_disease7)}), R.string.diseaseName_7, R.string.diseaseSymptoms_7, R.string.diseaseCause_7, R.string.diseaseManagement_7), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease8), Integer.valueOf(R.drawable.img_2_disease8), Integer.valueOf(R.drawable.img_3_disease8)}), R.string.diseaseName_8, R.string.diseaseSymptoms_8, R.string.diseaseCause_8, R.string.diseaseManagement_8), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease9), Integer.valueOf(R.drawable.img_2_disease9), Integer.valueOf(R.drawable.img_3_disease9)}), R.string.diseaseName_9, R.string.diseaseSymptoms_9, R.string.diseaseCause_9, R.string.diseaseManagement_9), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease10), Integer.valueOf(R.drawable.img_2_disease10), Integer.valueOf(R.drawable.img_3_disease10)}), R.string.diseaseName_10, R.string.diseaseSymptoms_10, R.string.diseaseCause_10, R.string.diseaseManagement_10), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease11), Integer.valueOf(R.drawable.img_2_disease11), Integer.valueOf(R.drawable.img_3_disease11)}), R.string.diseaseName_11, R.string.diseaseSymptoms_11, R.string.diseaseCause_11, R.string.diseaseManagement_11), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease12), Integer.valueOf(R.drawable.img_2_disease12), Integer.valueOf(R.drawable.img_3_disease12)}), R.string.diseaseName_12, R.string.diseaseSymptoms_12, R.string.diseaseCause_12, R.string.diseaseManagement_12), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease13), Integer.valueOf(R.drawable.img_2_disease13), Integer.valueOf(R.drawable.img_3_disease13)}), R.string.diseaseName_13, R.string.diseaseSymptoms_13, R.string.diseaseCause_13, R.string.diseaseManagement_13), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease14), Integer.valueOf(R.drawable.img_2_disease14), Integer.valueOf(R.drawable.img_3_disease14)}), R.string.diseaseName_14, R.string.diseaseSymptoms_14, R.string.diseaseCause_14, R.string.diseaseManagement_14), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease15), Integer.valueOf(R.drawable.img_2_disease15), Integer.valueOf(R.drawable.img_3_disease15)}), R.string.diseaseName_15, R.string.diseaseSymptoms_15, R.string.diseaseCause_15, R.string.diseaseManagement_15), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease16), Integer.valueOf(R.drawable.img_2_disease16), Integer.valueOf(R.drawable.img_3_disease16)}), R.string.diseaseName_16, R.string.diseaseSymptoms_16, R.string.diseaseCause_16, R.string.diseaseManagement_16), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease17), Integer.valueOf(R.drawable.img_2_disease17), Integer.valueOf(R.drawable.img_3_disease17)}), R.string.diseaseName_17, R.string.diseaseSymptoms_17, R.string.diseaseCause_17, R.string.diseaseManagement_17), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease18), Integer.valueOf(R.drawable.img_2_disease18), Integer.valueOf(R.drawable.img_3_disease18)}), R.string.diseaseName_18, R.string.diseaseSymptoms_18, R.string.diseaseCause_18, R.string.diseaseManagement_18), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease19), Integer.valueOf(R.drawable.img_2_disease19), Integer.valueOf(R.drawable.img_3_disease19)}), R.string.diseaseName_19, R.string.diseaseSymptoms_19, R.string.diseaseCause_19, R.string.diseaseManagement_19), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease20), Integer.valueOf(R.drawable.img_2_disease20), Integer.valueOf(R.drawable.img_3_disease20)}), R.string.diseaseName_20, R.string.diseaseSymptoms_20, R.string.diseaseCause_20, R.string.diseaseManagement_20), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease21), Integer.valueOf(R.drawable.img_2_disease21), Integer.valueOf(R.drawable.img_3_disease21)}), R.string.diseaseName_21, R.string.diseaseSymptoms_21, R.string.diseaseCause_21, R.string.diseaseManagement_21), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease22), Integer.valueOf(R.drawable.img_2_disease22), Integer.valueOf(R.drawable.img_3_disease22)}), R.string.diseaseName_22, R.string.diseaseSymptoms_22, R.string.diseaseCause_22, R.string.diseaseManagement_22), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease23), Integer.valueOf(R.drawable.img_2_disease23), Integer.valueOf(R.drawable.img_3_disease23)}), R.string.diseaseName_23, R.string.diseaseSymptoms_23, R.string.diseaseCause_23, R.string.diseaseManagement_23), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease24), Integer.valueOf(R.drawable.img_2_disease24), Integer.valueOf(R.drawable.img_3_disease24)}), R.string.diseaseName_24, R.string.diseaseSymptoms_24, R.string.diseaseCause_24, R.string.diseaseManagement_24), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease25), Integer.valueOf(R.drawable.img_2_disease25), Integer.valueOf(R.drawable.img_3_disease25)}), R.string.diseaseName_25, R.string.diseaseSymptoms_25, R.string.diseaseCause_25, R.string.diseaseManagement_25), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease26), Integer.valueOf(R.drawable.img_2_disease26), Integer.valueOf(R.drawable.img_3_disease26)}), R.string.diseaseName_26, R.string.diseaseSymptoms_26, R.string.diseaseCause_26, R.string.diseaseManagement_26), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease27), Integer.valueOf(R.drawable.img_2_disease27), Integer.valueOf(R.drawable.img_3_disease27)}), R.string.diseaseName_27, R.string.diseaseSymptoms_27, R.string.diseaseCause_27, R.string.diseaseManagement_27), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease28), Integer.valueOf(R.drawable.img_2_disease28), Integer.valueOf(R.drawable.img_3_disease28)}), R.string.diseaseName_28, R.string.diseaseSymptoms_28, R.string.diseaseCause_28, R.string.diseaseManagement_28), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease29), Integer.valueOf(R.drawable.img_2_disease29), Integer.valueOf(R.drawable.img_3_disease29)}), R.string.diseaseName_29, R.string.diseaseSymptoms_29, R.string.diseaseCause_29, R.string.diseaseManagement_29), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease30), Integer.valueOf(R.drawable.img_2_disease30), Integer.valueOf(R.drawable.img_3_disease30)}), R.string.diseaseName_30, R.string.diseaseSymptoms_30, R.string.diseaseCause_30, R.string.diseaseManagement_30), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease31), Integer.valueOf(R.drawable.img_2_disease31), Integer.valueOf(R.drawable.img_3_disease31)}), R.string.diseaseName_32, R.string.diseaseSymptoms_31, R.string.diseaseCause_3, R.string.diseaseManagement_31), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease32), Integer.valueOf(R.drawable.img_2_disease32), Integer.valueOf(R.drawable.img_3_disease32)}), R.string.diseaseName_32, R.string.diseaseSymptoms_32, R.string.diseaseCause_32, R.string.diseaseManagement_32), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease33), Integer.valueOf(R.drawable.img_2_disease33), Integer.valueOf(R.drawable.img_3_disease33)}), R.string.diseaseName_33, R.string.diseaseSymptoms_33, R.string.diseaseCause_33, R.string.diseaseManagement_33), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease34), Integer.valueOf(R.drawable.img_2_disease34), Integer.valueOf(R.drawable.img_3_disease34)}), R.string.diseaseName_34, R.string.diseaseSymptoms_34, R.string.diseaseCause_34, R.string.diseaseManagement_34), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease35), Integer.valueOf(R.drawable.img_2_disease35), Integer.valueOf(R.drawable.img_3_disease35)}), R.string.diseaseName_35, R.string.diseaseSymptoms_35, R.string.diseaseCause_35, R.string.diseaseManagement_35), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease36), Integer.valueOf(R.drawable.img_2_disease36), Integer.valueOf(R.drawable.img_3_disease36)}), R.string.diseaseName_36, R.string.diseaseSymptoms_36, R.string.diseaseCause_36, R.string.diseaseManagement_36), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease37), Integer.valueOf(R.drawable.img_2_disease37), Integer.valueOf(R.drawable.img_3_disease37)}), R.string.diseaseName_37, R.string.diseaseSymptoms_37, R.string.diseaseCause_37, R.string.diseaseManagement_37), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease38), Integer.valueOf(R.drawable.img_2_disease38), Integer.valueOf(R.drawable.img_3_disease38)}), R.string.diseaseName_38, R.string.diseaseSymptoms_38, R.string.diseaseCause_38, R.string.diseaseManagement_38), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease39), Integer.valueOf(R.drawable.img_2_disease39), Integer.valueOf(R.drawable.img_3_disease39)}), R.string.diseaseName_39, R.string.diseaseSymptoms_39, R.string.diseaseCause_39, R.string.diseaseManagement_39), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease40), Integer.valueOf(R.drawable.img_2_disease40), Integer.valueOf(R.drawable.img_3_disease40)}), R.string.diseaseName_40, R.string.diseaseSymptoms_40, R.string.diseaseCause_40, R.string.diseaseManagement_40), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease41), Integer.valueOf(R.drawable.img_2_disease41), Integer.valueOf(R.drawable.img_3_disease41)}), R.string.diseaseName_41, R.string.diseaseSymptoms_41, R.string.diseaseCause_41, R.string.diseaseManagement_41), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease42), Integer.valueOf(R.drawable.img_2_disease42), Integer.valueOf(R.drawable.img_3_disease42)}), R.string.diseaseName_42, R.string.diseaseSymptoms_42, R.string.diseaseCause_42, R.string.diseaseManagement_42), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease43), Integer.valueOf(R.drawable.img_2_disease43), Integer.valueOf(R.drawable.img_3_disease43)}), R.string.diseaseName_43, R.string.diseaseSymptoms_43, R.string.diseaseCause_43, R.string.diseaseManagement_43), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease44), Integer.valueOf(R.drawable.img_2_disease44), Integer.valueOf(R.drawable.img_3_disease44)}), R.string.diseaseName_44, R.string.diseaseSymptoms_44, R.string.diseaseCause_44, R.string.diseaseManagement_44), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease45), Integer.valueOf(R.drawable.img_2_disease45), Integer.valueOf(R.drawable.img_3_disease45)}), R.string.diseaseName_45, R.string.diseaseSymptoms_45, R.string.diseaseCause_45, R.string.diseaseManagement_45), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease46), Integer.valueOf(R.drawable.img_2_disease46), Integer.valueOf(R.drawable.img_3_disease46)}), R.string.diseaseName_46, R.string.diseaseSymptoms_46, R.string.diseaseCause_46, R.string.diseaseManagement_46), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease47), Integer.valueOf(R.drawable.img_2_disease47), Integer.valueOf(R.drawable.img_3_disease47)}), R.string.diseaseName_47, R.string.diseaseSymptoms_47, R.string.diseaseCause_47, R.string.diseaseManagement_47), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease48), Integer.valueOf(R.drawable.img_2_disease48), Integer.valueOf(R.drawable.img_3_disease48)}), R.string.diseaseName_48, R.string.diseaseSymptoms_48, R.string.diseaseCause_48, R.string.diseaseManagement_48), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease49), Integer.valueOf(R.drawable.img_2_disease49), Integer.valueOf(R.drawable.img_3_disease49)}), R.string.diseaseName_49, R.string.diseaseSymptoms_49, R.string.diseaseCause_49, R.string.diseaseManagement_49), new rf.a(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_1_disease50), Integer.valueOf(R.drawable.img_2_disease50), Integer.valueOf(R.drawable.img_3_disease50)}), R.string.diseaseName_50, R.string.diseaseSymptoms_50, R.string.diseaseCause_50, R.string.diseaseManagement_50));
        c registerForActivityResult = registerForActivityResult(new d(), new gb.d(this, 8));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f16611m = registerForActivityResult;
    }

    public static void I(DiagnoseActivity diagnoseActivity) {
        View currentFocus = diagnoseActivity.getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = diagnoseActivity.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_diagnose;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        i.c(new pf.d(this, 0), new pf.d(this, 1));
    }

    @Override // mf.a
    public final void q() {
        a aVar = new a(new pf.c(this, 0));
        this.f16608j = aVar;
        aVar.d(CollectionsKt.sortedWith(this.f16609k, new b(this, 1)));
        e eVar = (e) n();
        eVar.f20737y.setAdapter(this.f16608j);
        eVar.f20737y.setLayoutManager(new LinearLayoutManager(this, 1, false));
        w2 w2Var = new w2(this, 1);
        EditText editText = eVar.u;
        editText.addTextChangedListener(w2Var);
        editText.setOnEditorActionListener(new pf.a(this, 0));
    }

    @Override // mf.a
    public final void s() {
        ImageView btnBack = ((e) n()).f20733t;
        Intrinsics.checkNotNullExpressionValue(btnBack, "btnBack");
        com.bumptech.glide.e.p(btnBack, new pf.c(this, 1));
        LinearLayout layoutContainer = ((e) n()).f20735w;
        Intrinsics.checkNotNullExpressionValue(layoutContainer, "layoutContainer");
        com.bumptech.glide.e.p(layoutContainer, new pf.c(this, 2));
    }
}
