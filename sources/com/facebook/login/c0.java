package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.internal.m0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c0 extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.k f11193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11193d = com.facebook.k.FACEBOOK_APPLICATION_WEB;
    }

    @Override // com.facebook.login.a0
    public final boolean k(int i10, int i11, Intent data) {
        String string;
        String str;
        String string2;
        Object obj;
        r rVar = f().f11301i;
        if (data == null) {
            o(ni.a.m(rVar, "Operation canceled"));
        } else {
            String str2 = null;
            if (i11 == 0) {
                Intrinsics.checkNotNullParameter(data, "data");
                Bundle extras = data.getExtras();
                if (extras == null) {
                    string = null;
                } else {
                    string = extras.getString("error");
                }
                if (string == null) {
                    if (extras == null) {
                        string = null;
                    } else {
                        string = extras.getString("error_type");
                    }
                }
                if (extras == null || (obj = extras.get("error_code")) == null) {
                    str = null;
                } else {
                    str = obj.toString();
                }
                if (Intrinsics.areEqual("CONNECTION_FAILURE", str)) {
                    if (extras == null) {
                        string2 = null;
                    } else {
                        string2 = extras.getString("error_message");
                    }
                    if (string2 == null) {
                        if (extras != null) {
                            str2 = extras.getString("error_description");
                        }
                    } else {
                        str2 = string2;
                    }
                    o(ni.a.q(rVar, string, str2, str));
                } else {
                    o(ni.a.m(rVar, string));
                }
            } else if (i11 != -1) {
                o(ni.a.q(rVar, "Unexpected resultCode from authorization.", null, null));
            } else {
                Bundle extras2 = data.getExtras();
                if (extras2 == null) {
                    o(ni.a.q(rVar, "Unexpected null from returned authorization data.", null, null));
                    return true;
                }
                String string3 = extras2.getString("error");
                if (string3 == null) {
                    string3 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                if (obj2 != null) {
                    str2 = obj2.toString();
                }
                String string4 = extras2.getString("error_message");
                if (string4 == null) {
                    string4 = extras2.getString("error_description");
                }
                String string5 = extras2.getString("e2e");
                if (!m0.z(string5)) {
                    j(string5);
                }
                if (string3 == null && str2 == null && string4 == null && rVar != null) {
                    if (extras2.containsKey("code") && !m0.z(extras2.getString("code"))) {
                        com.facebook.x.c().execute(new androidx.emoji2.text.n(8, this, rVar, extras2));
                    } else {
                        s(extras2, rVar);
                    }
                } else {
                    r(rVar, string3, string4, str2);
                }
            }
        }
        return true;
    }

    public final void o(t tVar) {
        if (tVar != null) {
            f().f(tVar);
        } else {
            f().m();
        }
    }

    public com.facebook.k q() {
        return this.f11193d;
    }

    public final void r(r rVar, String str, String str2, String str3) {
        if (str != null && Intrinsics.areEqual(str, "logged_out")) {
            b.f11181k = true;
            o(null);
        } else if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"}), str)) {
            o(null);
        } else if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"access_denied", "OAuthAccessDeniedException"}), str)) {
            o(ni.a.m(rVar, null));
        } else {
            o(ni.a.q(rVar, str, str2, str3));
        }
    }

    public final void s(Bundle extras, r request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            o(ni.a.o(request, ni.a.k(request.f11265c, extras, q(), request.f11267f), ni.a.l(extras, request.f11278q)));
        } catch (com.facebook.q e2) {
            o(ni.a.q(request, null, e2.getMessage(), null));
        }
    }

    public final boolean t(Intent intent) {
        x xVar;
        if (intent != null) {
            Intrinsics.checkNotNullExpressionValue(com.facebook.x.a().getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!r1.isEmpty()) {
                Fragment fragment = f().f11297d;
                Unit unit = null;
                if (fragment instanceof x) {
                    xVar = (x) fragment;
                } else {
                    xVar = null;
                }
                if (xVar != null) {
                    androidx.activity.result.c cVar = xVar.f11312f;
                    if (cVar != null) {
                        cVar.a(intent);
                        unit = Unit.INSTANCE;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("launcher");
                        throw null;
                    }
                }
                if (unit == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11193d = com.facebook.k.FACEBOOK_APPLICATION_WEB;
    }
}
