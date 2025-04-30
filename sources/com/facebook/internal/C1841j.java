package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.Date;

/* renamed from: com.facebook.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841j extends DialogInterfaceOnCancelListenerC0487w {
    public Dialog b;

    public final void c(Bundle bundle, C1849l c1849l) {
        int i9;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        B b = B.f13569a;
        Intent intent = activity.getIntent();
        G7.j.d(intent, "fragmentActivity.intent");
        Intent e4 = B.e(intent, bundle, c1849l);
        if (c1849l == null) {
            i9 = -1;
        } else {
            i9 = 0;
        }
        activity.setResult(i9, e4);
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.b instanceof O) && isResumed()) {
            Dialog dialog = this.b;
            if (dialog != null) {
                ((O) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.internal.O, android.app.Dialog] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        boolean z8;
        O o3;
        String string;
        Bundle bundle2;
        final int i9 = 1;
        final int i10 = 0;
        super.onCreate(bundle);
        if (this.b == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            B b = B.f13569a;
            G7.j.d(intent, "intent");
            Bundle h6 = B.h(intent);
            if (h6 == null) {
                z8 = false;
            } else {
                z8 = h6.getBoolean("is_fallback", false);
            }
            String str = null;
            if (!z8) {
                if (h6 == null) {
                    string = null;
                } else {
                    string = h6.getString("action");
                }
                if (h6 == null) {
                    bundle2 = null;
                } else {
                    bundle2 = h6.getBundle("params");
                }
                if (H.B(string)) {
                    com.facebook.r rVar = com.facebook.r.f13801a;
                    activity.finish();
                    return;
                }
                if (string != null) {
                    Date date = C0785a.f13439n;
                    C0785a m = com.facebook.appevents.g.m();
                    if (!com.facebook.appevents.g.q()) {
                        str = com.facebook.r.b();
                    }
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    J j7 = new J(this) { // from class: com.facebook.internal.i

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C1841j f13615c;

                        {
                            this.f13615c = this;
                        }

                        @Override // com.facebook.internal.J
                        public final void a(Bundle bundle3, C1849l c1849l) {
                            switch (i10) {
                                case 0:
                                    C1841j c1841j = this.f13615c;
                                    G7.j.e(c1841j, "this$0");
                                    c1841j.c(bundle3, c1849l);
                                    return;
                                default:
                                    C1841j c1841j2 = this.f13615c;
                                    G7.j.e(c1841j2, "this$0");
                                    FragmentActivity activity2 = c1841j2.getActivity();
                                    if (activity2 != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity2.setResult(-1, intent2);
                                        activity2.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    if (m != null) {
                        bundle2.putString(MBridgeConstans.APP_ID, m.f13448j);
                        bundle2.putString("access_token", m.f13445g);
                    } else {
                        bundle2.putString(MBridgeConstans.APP_ID, str);
                    }
                    O.b(activity);
                    o3 = new O(activity, string, bundle2, com.facebook.login.A.FACEBOOK, j7);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (h6 != null) {
                    str = h6.getString("url");
                }
                if (H.B(str)) {
                    com.facebook.r rVar2 = com.facebook.r.f13801a;
                    activity.finish();
                    return;
                }
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.r.b()}, 1));
                int i11 = DialogC1845n.f13622q;
                if (str != null) {
                    O.b(activity);
                    AbstractC1839h.k();
                    int i12 = O.f13594o;
                    if (i12 == 0) {
                        AbstractC1839h.k();
                        i12 = O.f13594o;
                    }
                    ?? dialog = new Dialog(activity, i12);
                    dialog.b = str;
                    dialog.f13595c = format;
                    dialog.f13596d = new J(this) { // from class: com.facebook.internal.i

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C1841j f13615c;

                        {
                            this.f13615c = this;
                        }

                        @Override // com.facebook.internal.J
                        public final void a(Bundle bundle3, C1849l c1849l) {
                            switch (i9) {
                                case 0:
                                    C1841j c1841j = this.f13615c;
                                    G7.j.e(c1841j, "this$0");
                                    c1841j.c(bundle3, c1849l);
                                    return;
                                default:
                                    C1841j c1841j2 = this.f13615c;
                                    G7.j.e(c1841j2, "this$0");
                                    FragmentActivity activity2 = c1841j2.getActivity();
                                    if (activity2 != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity2.setResult(-1, intent2);
                                        activity2.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    o3 = dialog;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.b = o3;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.b;
        if (dialog == null) {
            c(null, null);
            setShowsDialog(false);
            return super.onCreateDialog(bundle);
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
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
        Dialog dialog = this.b;
        if (dialog instanceof O) {
            if (dialog != null) {
                ((O) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }
}
