package com.plantcare.ai.identifier.plantid.ui.component.language;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import d3.g;
import dg.d;
import dg.e;
import e3.b;
import java.util.ArrayList;
import java.util.Locale;
import kf.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import pf.f;
import v8.u0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/language/LanguageActivity;", "Lmf/a;", "Lkf/q;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLanguageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/language/LanguageActivity\n+ 2 EasyPreferences.kt\ncom/plantcare/ai/identifier/plantid/utils/EasyPreferences\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n49#2,7:240\n49#2,7:247\n350#3,7:254\n*S KotlinDebug\n*F\n+ 1 LanguageActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/language/LanguageActivity\n*L\n48#1:240,7\n150#1:247,7\n238#1:254,7\n*E\n"})
/* loaded from: classes4.dex */
public final class LanguageActivity extends f {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f16634p = 0;

    /* renamed from: j, reason: collision with root package name */
    public d f16635j;

    /* renamed from: k, reason: collision with root package name */
    public e f16636k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16637l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16638m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16639n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16640o;

    public LanguageActivity() {
        super(4);
    }

    public final void I() {
        FrameLayout frAds = ((q) n()).f20858t;
        Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
        com.bumptech.glide.e.D(frAds);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0094 -> B:15:0x00a0). Please report as a decompilation issue!!! */
    public final void J() {
        String str;
        boolean equals;
        if (this.f16636k != null && this.f16637l) {
            SharedPreferences o10 = o();
            e eVar = this.f16636k;
            if (eVar != null) {
                str = eVar.f17039c;
            } else {
                str = null;
            }
            u0.i0("KEY_LANGUAGE", str, o10);
            String string = o().getString("KEY_LANGUAGE", "en");
            if (Intrinsics.areEqual(string, "")) {
                Configuration configuration = new Configuration();
                Locale locale = Locale.getDefault();
                Locale.setDefault(locale);
                configuration.locale = locale;
                getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            } else {
                equals = StringsKt__StringsJVMKt.equals(string, "", true);
                if (!equals) {
                    Locale locale2 = new Locale(string);
                    Locale.setDefault(locale2);
                    Configuration configuration2 = new Configuration();
                    configuration2.locale = locale2;
                    getResources().updateConfiguration(configuration2, getResources().getDisplayMetrics());
                }
            }
            try {
                if (this.f16638m) {
                    w5.d.g(this);
                } else {
                    Intrinsics.checkNotNullParameter(this, "fromActivity");
                    Intent intent = new Intent(this, (Class<?>) OnBoardingActivity.class);
                    intent.setFlags(268468224);
                    intent.putExtra("key_tracking_screen_from", "LanguageActivity");
                    startActivity(intent);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        com.bumptech.glide.d.E(this, R.string.please_select_language);
    }

    public final ArrayList K() {
        Long l10;
        long j3;
        String str;
        Float f10;
        float f11;
        Boolean bool;
        boolean z10;
        Integer num;
        int i10;
        ArrayList arrayList = new ArrayList();
        SharedPreferences o10 = o();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        GlobalApp globalApp = null;
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            str = o10.getString("KEY_LANGUAGE", "en");
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if ("en" instanceof Integer) {
                num = (Integer) "en";
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = -1;
            }
            str = (String) Integer.valueOf(o10.getInt("KEY_LANGUAGE", i10));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            if ("en" instanceof Boolean) {
                bool = (Boolean) "en";
            } else {
                bool = null;
            }
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            str = (String) Boolean.valueOf(o10.getBoolean("KEY_LANGUAGE", z10));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            if ("en" instanceof Float) {
                f10 = (Float) "en";
            } else {
                f10 = null;
            }
            if (f10 != null) {
                f11 = f10.floatValue();
            } else {
                f11 = -1.0f;
            }
            str = (String) Float.valueOf(o10.getFloat("KEY_LANGUAGE", f11));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if ("en" instanceof Long) {
                l10 = (Long) "en";
            } else {
                l10 = null;
            }
            if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = -1;
            }
            str = (String) Long.valueOf(o10.getLong("KEY_LANGUAGE", j3));
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        arrayList.add(new e("English", "en", false, Integer.valueOf(R.drawable.ic_english)));
        arrayList.add(new e("Hindi", "hi", false, Integer.valueOf(R.drawable.ic_hindi)));
        arrayList.add(new e("Spanish", "es", false, Integer.valueOf(R.drawable.ic_spanish)));
        arrayList.add(new e("French", "fr", false, Integer.valueOf(R.drawable.ic_france)));
        arrayList.add(new e("Portuguese", "pt", false, Integer.valueOf(R.drawable.ic_portugal)));
        arrayList.add(new e("Korean", "ko", false, Integer.valueOf(R.drawable.ic_korean)));
        arrayList.add(new e("German", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, false, Integer.valueOf(R.drawable.ic_german)));
        arrayList.add(new e("Italian", "it", false, Integer.valueOf(R.drawable.ic_italian)));
        GlobalApp globalApp2 = GlobalApp.f16592f;
        if (globalApp2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            globalApp2 = null;
        }
        globalApp2.getClass();
        if (GlobalApp.b() != null) {
            GlobalApp globalApp3 = GlobalApp.f16592f;
            if (globalApp3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                globalApp3 = null;
            }
            globalApp3.getClass();
            if (!CollectionsKt.contains(arrayList, GlobalApp.b())) {
                arrayList.remove(arrayList.get(arrayList.size() - 1));
                GlobalApp globalApp4 = GlobalApp.f16592f;
                if (globalApp4 != null) {
                    globalApp = globalApp4;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                }
                globalApp.getClass();
                e b3 = GlobalApp.b();
                if (b3 != null) {
                    arrayList.add(0, b3);
                }
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (Intrinsics.areEqual(str, ((e) arrayList.get(i11)).f17039c)) {
                Object obj = arrayList.get(i11);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                e eVar = (e) obj;
                eVar.f17040d = false;
                arrayList.remove(arrayList.get(i11));
                arrayList.add(arrayList.size(), eVar);
                break;
            }
            i11++;
        }
        return arrayList;
    }

    public final void L() {
        if (!com.bumptech.glide.d.q(this)) {
            I();
            return;
        }
        if (u0.f26300f != null && !this.f16638m && !this.f16639n) {
            FrameLayout frAds = ((q) n()).f20858t;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            com.bumptech.glide.e.V(frAds);
            b bVar = u0.f26300f;
            g r6 = g.r();
            FrameLayout frameLayout = ((q) n()).f20858t;
            ShimmerFrameLayout shimmerFrameLayout = ((q) n()).f20861x.f20900t;
            r6.getClass();
            g.C(this, bVar, frameLayout, shimmerFrameLayout);
            return;
        }
        I();
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_language;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f16638m) {
            J();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity.q():void");
    }

    @Override // mf.a
    public final void s() {
        ImageView icDone = ((q) n()).f20859v;
        Intrinsics.checkNotNullExpressionValue(icDone, "icDone");
        com.bumptech.glide.e.p(icDone, new dg.b(this, 0));
        ImageView icBack = ((q) n()).u;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        com.bumptech.glide.e.p(icBack, new dg.b(this, 1));
    }
}
