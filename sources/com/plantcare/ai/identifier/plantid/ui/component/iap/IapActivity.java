package com.plantcare.ai.identifier.plantid.ui.component.iap;

import a4.c;
import a4.d;
import a4.m;
import a4.r;
import a4.t;
import a4.u;
import ag.b;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s0;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import hf.f;
import java.util.ArrayList;
import java.util.List;
import kf.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import mf.a;
import v8.u0;
import w5.k;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/iap/IapActivity;", "Lmf/a;", "Lkf/o;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nIapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IapActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/iap/IapActivity\n+ 2 EasyPreferences.kt\ncom/plantcare/ai/identifier/plantid/utils/EasyPreferences\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,379:1\n49#2,7:380\n1855#3,2:387\n*S KotlinDebug\n*F\n+ 1 IapActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/iap/IapActivity\n*L\n255#1:380,7\n209#1:387,2\n*E\n"})
/* loaded from: classes4.dex */
public final class IapActivity extends a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f16628k = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16629f;

    /* renamed from: g, reason: collision with root package name */
    public d f16630g;

    /* renamed from: h, reason: collision with root package name */
    public IapDomain f16631h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f16632i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public bg.a f16633j;

    public static final void t(IapActivity iapActivity) {
        iapActivity.getClass();
        m a = a4.a.a();
        a.f153b = "inapp";
        a4.a a10 = a.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        d dVar = iapActivity.f16630g;
        if (dVar != null) {
            dVar.p(a10, new ag.a(iapActivity));
        }
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_iap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final void q() {
        int i10;
        List<IapDomain> iaps;
        long j3;
        Boolean bool;
        float f10;
        boolean z10;
        int i11;
        boolean booleanExtra = getIntent().getBooleanExtra("from_onb_or_permission", false);
        this.f16629f = booleanExtra;
        if (booleanExtra) {
            SharedPreferences o10 = o();
            Boolean bool2 = Boolean.TRUE;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
            Long l10 = null;
            String str = null;
            Integer num = null;
            Float f11 = null;
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                if (bool2 instanceof String) {
                    str = (String) bool2;
                }
                bool = (Boolean) o10.getString("KEY_FIRST_INSTALL_APP", str);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                if (bool2 instanceof Integer) {
                    num = (Integer) bool2;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = -1;
                }
                bool = (Boolean) Integer.valueOf(o10.getInt("KEY_FIRST_INSTALL_APP", i11));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                if (bool2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(o10.getBoolean("KEY_FIRST_INSTALL_APP", z10));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                if (bool2 instanceof Float) {
                    f11 = (Float) bool2;
                }
                if (f11 != null) {
                    f10 = f11.floatValue();
                } else {
                    f10 = -1.0f;
                }
                bool = (Boolean) Float.valueOf(o10.getFloat("KEY_FIRST_INSTALL_APP", f10));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                if (bool2 instanceof Long) {
                    l10 = (Long) bool2;
                }
                if (l10 != null) {
                    j3 = l10.longValue();
                } else {
                    j3 = -1;
                }
                bool = (Boolean) Long.valueOf(o10.getLong("KEY_FIRST_INSTALL_APP", j3));
            } else {
                throw new UnsupportedOperationException("Not yet implemented");
            }
            if (Intrinsics.areEqual(bool, bool2)) {
                u0.i0("KEY_FIRST_INSTALL_APP", Boolean.FALSE, o());
            }
            TextView tvSkip = ((o) n()).E;
            Intrinsics.checkNotNullExpressionValue(tvSkip, "tvSkip");
            e.V(tvSkip);
            ImageView icClose = ((o) n()).u;
            Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
            e.E(icClose);
        } else {
            ImageView icClose2 = ((o) n()).u;
            Intrinsics.checkNotNullExpressionValue(icClose2, "icClose");
            e.V(icClose2);
            TextView tvSkip2 = ((o) n()).E;
            Intrinsics.checkNotNullExpressionValue(tvSkip2, "tvSkip");
            e.E(tvSkip2);
        }
        c cVar = new c(this);
        cVar.b();
        cVar.f86c = new ag.a(this);
        d a = cVar.a();
        this.f16630g = a;
        a.J(new s0(this, 1));
        g3.c.a().f18008c = new b(this, 0);
        RecyclerView recyclerView = ((o) n()).f20844x;
        bg.a aVar = new bg.a(this, new k(this, 9));
        if (i.l()) {
            aVar.f2433m = 1;
            aVar.notifyItemChanged(1);
            i10 = aVar.f2433m;
        } else {
            aVar.f2433m = 0;
            aVar.notifyItemChanged(0);
            i10 = aVar.f2433m;
        }
        if (f.c()) {
            iaps = va.b.m();
        } else {
            iaps = va.b.n();
        }
        g3.c appPurchase = g3.c.a();
        Intrinsics.checkNotNullExpressionValue(appPurchase, "getInstance(...)");
        Intrinsics.checkNotNullParameter(iaps, "iaps");
        Intrinsics.checkNotNullParameter(appPurchase, "appPurchase");
        ArrayList newData = new ArrayList();
        for (IapDomain iapDomain : iaps) {
            String str2 = "";
            if (iapDomain.isTypeSubYear()) {
                u uVar = (u) appPurchase.f18014i.get(iapDomain.getIdSub());
                if (uVar != null) {
                    ArrayList arrayList = ((t) uVar.f168i.get(r10.size() - 1)).f160b.a;
                    Log.e("PurchaseEG", "getPriceSub: " + ((r) arrayList.get(arrayList.size() - 1)).a);
                    str2 = ((r) arrayList.get(arrayList.size() + (-1))).a;
                }
                Intrinsics.checkNotNullExpressionValue(str2, "getPriceSub(...)");
            } else {
                u uVar2 = (u) appPurchase.f18013h.get(iapDomain.getIdSub());
                if (uVar2 != null) {
                    Log.e("PurchaseEG", "getPrice: " + uVar2.a().a);
                    str2 = uVar2.a().a;
                }
                Intrinsics.checkNotNullExpressionValue(str2, "getPrice(...)");
            }
            iapDomain.setPrice(str2);
            newData.add(iapDomain);
        }
        IapDomain iapDomain2 = (IapDomain) newData.get(i10);
        if (iapDomain2.isTypeSubYear()) {
            ((o) n()).f20845y.setText(getString(R.string.unlimited));
            ((o) n()).A.setText(getString(R.string.plant_identification_and_disease));
        } else {
            ((o) n()).f20845y.setText(getString(R.string.number_scans, String.valueOf(iapDomain2.getNumberOfScans())));
            ((o) n()).A.setText(getString(R.string.plant_identification_and_disease));
        }
        this.f16631h = iapDomain2;
        Intrinsics.checkNotNullParameter(newData, "newData");
        ArrayList arrayList2 = aVar.f22239i;
        arrayList2.clear();
        arrayList2.addAll(newData);
        aVar.notifyDataSetChanged();
        this.f16633j = aVar;
        recyclerView.setAdapter(aVar);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        ((o) n()).f20846z.setSelected(true);
        ((o) n()).A.setSelected(true);
        ((o) n()).B.setSelected(true);
        ((o) n()).C.setSelected(true);
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((o) n()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new ag.d(this, 0));
        TextView btnContinue = ((o) n()).f20841t;
        Intrinsics.checkNotNullExpressionValue(btnContinue, "btnContinue");
        int i10 = 1;
        ag.d action = new ag.d(this, i10);
        Intrinsics.checkNotNullParameter(btnContinue, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        btnContinue.setOnClickListener(new nf.a(i10, action));
        TextView tvPolicyWarning = ((o) n()).D;
        Intrinsics.checkNotNullExpressionValue(tvPolicyWarning, "tvPolicyWarning");
        e.p(tvPolicyWarning, new ag.d(this, 2));
        TextView tvSkip = ((o) n()).E;
        Intrinsics.checkNotNullExpressionValue(tvSkip, "tvSkip");
        e.p(tvSkip, new ag.d(this, 3));
    }
}
