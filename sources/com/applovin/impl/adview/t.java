package com.applovin.impl.adview;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.SnapshotStateKt;
import com.applovin.impl.pc;
import com.applovin.impl.sj;
import com.applovin.mediation.MaxAdListener;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzhaj;
import com.google.android.gms.internal.play_billing.zzee;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ Iterator A() {
        try {
            return Arrays.asList(new c1.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void B(int i2, HashMap hashMap, String str, int i3, String str2) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
    }

    public static void C(String str, int i2, String str2) {
        zzea.zzf(str2, str + i2);
    }

    public static /* synthetic */ String D(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static int a(int i2, int i3, int i4) {
        return zzhaj.zzD(i2) + i3 + i4;
    }

    public static int b(String str, int i2) {
        return String.valueOf(str).length() + i2;
    }

    public static sj c(TimeUnit timeUnit, long j2, String str) {
        return sj.a(str, Long.valueOf(timeUnit.toMillis(j2)));
    }

    public static IObjectWrapper d(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static Object e(ComposerImpl composerImpl, int i2, int i3) {
        composerImpl.J(i2);
        composerImpl.J(i3);
        return composerImpl.u();
    }

    public static Object f(IAPViewModel iAPViewModel, ComposerImpl composerImpl, int i2) {
        return SnapshotStateKt.b(iAPViewModel.getState(), composerImpl, i2).getValue();
    }

    public static Object g(Class cls, Scope scope, Qualifier qualifier, q0.a aVar, ComposerImpl composerImpl) {
        Object obj = scope.get(g0.a(cls), qualifier, aVar);
        composerImpl.o(obj);
        return obj;
    }

    public static String h(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    public static String i(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String j(int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String k(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String l(com.applovin.impl.mediation.g gVar, StringBuilder sb, String str, Bundle bundle) {
        sb.append(gVar.f25492f);
        sb.append(str);
        sb.append(bundle);
        return sb.toString();
    }

    public static String m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static StringBuilder n(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static /* synthetic */ Iterator o() {
        try {
            return Arrays.asList(new c1.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static SingleInstanceFactory p(BeanDefinition beanDefinition, Module module) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        module.indexPrimaryType(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static Scope q(ComposerImpl composerImpl, int i2, ComposerImpl composerImpl2, int i3, int i4) {
        composerImpl.t(i2);
        Scope currentKoinScope = KoinApplicationKt.currentKoinScope(composerImpl2, i3);
        composerImpl.t(i4);
        return currentKoinScope;
    }

    public static void r(int i2, int i3, int i4, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i2, i3, i4)));
    }

    public static void s(int i2, HashMap hashMap, String str, int i3, String str2) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
    }

    public static void t(Bundle bundle, String str) {
        bundle.putLong(str, zzu.zzB().currentTimeMillis());
    }

    public static void u(String str, int i2, String str2) {
        pc.d(str2, str + i2);
    }

    public static void v(String str, String str2, com.applovin.impl.sdk.n nVar, String str3) {
        nVar.a(str3, str + str2);
    }

    public static void w(String str, String str2, String str3) {
        zzea.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static void x(StringBuilder sb, MaxAdListener maxAdListener, com.applovin.impl.sdk.n nVar, String str) {
        sb.append(maxAdListener);
        nVar.a(str, sb.toString());
    }

    public static boolean y(ComposerImpl composerImpl, boolean z2, int i2, Object obj) {
        composerImpl.V(z2);
        composerImpl.t(i2);
        return composerImpl.I(obj);
    }

    public static int z(int i2, int i3, int i4) {
        return zzee.zzx(i2) + i3 + i4;
    }
}
