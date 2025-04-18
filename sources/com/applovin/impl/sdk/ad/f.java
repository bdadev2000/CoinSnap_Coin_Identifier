package com.applovin.impl.sdk.ad;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MotionEvent;
import com.applovin.impl.ql;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.y1;
import com.google.common.collect.z1;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import ic.i;
import java.util.HashMap;
import java.util.List;
import k9.h;
import k9.l;
import k9.o;
import kotlin.jvm.internal.Intrinsics;
import v8.i1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements n.a, l, Continuation, SuccessContinuation, UserMessagingPlatform.OnConsentFormLoadSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7620d;

    public /* synthetic */ f(ConsentInformation consentInformation, ag.b bVar, boolean z10) {
        this.f7618b = z10;
        this.f7619c = bVar;
        this.f7620d = consentInformation;
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        List a;
        a = ((b) this.f7619c).a((MotionEvent) this.f7620d, this.f7618b, (ql) obj);
        return a;
    }

    @Override // k9.l
    public final z1 b(int i10, i1 i1Var, int[] iArr) {
        o oVar = (o) this.f7619c;
        h hVar = (h) this.f7620d;
        boolean z10 = this.f7618b;
        y1 y1Var = o.f20461j;
        oVar.getClass();
        k9.d dVar = new k9.d(oVar);
        n0 n0Var = r0.f12026c;
        m0 m0Var = new m0();
        for (int i11 = 0; i11 < i1Var.f26163b; i11++) {
            m0Var.u(new k9.e(i10, i1Var, i11, hVar, iArr[i11], z10, dVar));
        }
        return m0Var.y();
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        final de.a callback = (de.a) this.f7619c;
        ConsentInformation consentInformation = (ConsentInformation) this.f7620d;
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(consentInformation, "$consentInformation");
        boolean z10 = this.f7618b;
        if (!z10) {
            int consentStatus = consentInformation.getConsentStatus();
            ag.b bVar = (ag.b) callback;
            switch (bVar.a) {
                case 0:
                    Log.v("Ynsuper", "onConsentStatus: " + consentStatus);
                    break;
                default:
                    ((SplashActivity) bVar.f483b).getClass();
                    break;
            }
        }
        if (consentInformation.getConsentStatus() == 2) {
            if (z10) {
                ag.b bVar2 = (ag.b) callback;
                switch (bVar2.a) {
                    case 0:
                        Log.v("Ynsuper", "onRequestShowDialog: ");
                        xg.b.a.a("display_consent_2");
                        break;
                    default:
                        xg.b.a.a("new_display_consent_1");
                        break;
                }
                consentForm.show(bVar2.b(), new ConsentForm.OnConsentFormDismissedListener() { // from class: de.c
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
                    
                        if (r0 != false) goto L34;
                     */
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onConsentFormDismissed(com.google.android.ump.FormError r12) {
                        /*
                            Method dump skipped, instructions count: 416
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: de.c.onConsentFormDismissed(com.google.android.ump.FormError):void");
                    }
                });
                return;
            }
            return;
        }
        if (consentInformation.getConsentStatus() == 1) {
            ((ag.b) callback).d();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        mc.d dVar = (mc.d) this.f7619c;
        boolean z10 = this.f7618b;
        mc.f fVar = (mc.f) this.f7620d;
        HashMap hashMap = mc.d.f22157d;
        if (z10) {
            synchronized (dVar) {
                dVar.f22160c = Tasks.forResult(fVar);
            }
        } else {
            dVar.getClass();
        }
        return Tasks.forResult(fVar);
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z10) {
        this.f7619c = obj;
        this.f7620d = obj2;
        this.f7618b = z10;
    }

    public /* synthetic */ f(mc.d dVar, mc.f fVar) {
        this.f7619c = dVar;
        this.f7618b = true;
        this.f7620d = fVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.f7619c;
        Intent intent = (Intent) this.f7620d;
        Object obj = i.f19554c;
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? i.a(context, intent, this.f7618b).continueWith(new l.a(16), new nb.a(3)) : task;
    }
}
