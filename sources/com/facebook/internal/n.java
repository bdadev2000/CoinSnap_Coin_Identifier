package com.facebook.internal;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/n;", "Landroidx/fragment/app/r;", "<init>", "()V", "com/facebook/internal/m", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class n extends androidx.fragment.app.r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11057c = 0;

    /* renamed from: b, reason: collision with root package name */
    public Dialog f11058b;

    public final void c(Bundle bundle, com.facebook.q qVar) {
        int i10;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        g0 g0Var = g0.a;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        Intent e2 = g0.e(intent, bundle, qVar);
        if (qVar == null) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        activity.setResult(i10, e2);
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f11058b instanceof v0) && isResumed()) {
            Dialog dialog = this.f11058b;
            if (dialog != null) {
                ((v0) dialog).c();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity context;
        boolean z10;
        v0 v0Var;
        String string;
        super.onCreate(bundle);
        if (this.f11058b == null && (context = getActivity()) != null) {
            Intent intent = context.getIntent();
            g0 g0Var = g0.a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle h10 = g0.h(intent);
            final int i10 = 0;
            if (h10 == null) {
                z10 = false;
            } else {
                z10 = h10.getBoolean("is_fallback", false);
            }
            String url = null;
            Bundle bundle2 = null;
            if (!z10) {
                if (h10 == null) {
                    string = null;
                } else {
                    string = h10.getString("action");
                }
                if (h10 != null) {
                    bundle2 = h10.getBundle("params");
                }
                if (m0.z(string)) {
                    com.facebook.x xVar = com.facebook.x.a;
                    context.finish();
                    return;
                }
                if (string != null) {
                    o0 o0Var = new o0(context, string, bundle2);
                    o0Var.f11062d = new q0(this) { // from class: com.facebook.internal.j

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f11046b;

                        {
                            this.f11046b = this;
                        }

                        @Override // com.facebook.internal.q0
                        public final void a(Bundle bundle3, com.facebook.q qVar) {
                            int i11 = i10;
                            n this$0 = this.f11046b;
                            switch (i11) {
                                case 0:
                                    int i12 = n.f11057c;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.c(bundle3, qVar);
                                    return;
                                default:
                                    int i13 = n.f11057c;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    FragmentActivity activity = this$0.getActivity();
                                    if (activity != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity.setResult(-1, intent2);
                                        activity.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    com.facebook.a aVar = o0Var.f11064f;
                    if (aVar != null) {
                        Bundle bundle3 = o0Var.f11063e;
                        if (bundle3 != null) {
                            bundle3.putString(MBridgeConstans.APP_ID, aVar.f10890j);
                        }
                        Bundle bundle4 = o0Var.f11063e;
                        if (bundle4 != null) {
                            bundle4.putString("access_token", aVar.f10887g);
                        }
                    } else {
                        Bundle bundle5 = o0Var.f11063e;
                        if (bundle5 != null) {
                            bundle5.putString(MBridgeConstans.APP_ID, o0Var.f11060b);
                        }
                    }
                    int i11 = v0.f11104o;
                    Context context2 = o0Var.a;
                    if (context2 != null) {
                        String str = o0Var.f11061c;
                        Bundle bundle6 = o0Var.f11063e;
                        q0 q0Var = o0Var.f11062d;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        v0.a(context2);
                        v0Var = new v0(context2, str, bundle6, com.facebook.login.b0.FACEBOOK, q0Var);
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (h10 != null) {
                    url = h10.getString("url");
                }
                if (m0.z(url)) {
                    com.facebook.x xVar2 = com.facebook.x.a;
                    context.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                final int i12 = 1;
                String expectedRedirectUrl = com.applovin.impl.mediation.ads.e.h(new Object[]{com.facebook.x.b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i13 = r.f11070q;
                if (url != null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                    v0.a(context);
                    r rVar = new r(context, url, expectedRedirectUrl);
                    rVar.f11107d = new q0(this) { // from class: com.facebook.internal.j

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f11046b;

                        {
                            this.f11046b = this;
                        }

                        @Override // com.facebook.internal.q0
                        public final void a(Bundle bundle32, com.facebook.q qVar) {
                            int i112 = i12;
                            n this$0 = this.f11046b;
                            switch (i112) {
                                case 0:
                                    int i122 = n.f11057c;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.c(bundle32, qVar);
                                    return;
                                default:
                                    int i132 = n.f11057c;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    FragmentActivity activity = this$0.getActivity();
                                    if (activity != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle32 == null) {
                                            bundle32 = new Bundle();
                                        }
                                        intent2.putExtras(bundle32);
                                        activity.setResult(-1, intent2);
                                        activity.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    v0Var = rVar;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.f11058b = v0Var;
        }
    }

    @Override // androidx.fragment.app.r
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f11058b;
        if (dialog == null) {
            c(null, null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f11058b;
        if (dialog instanceof v0) {
            if (dialog != null) {
                ((v0) dialog).c();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }
}
