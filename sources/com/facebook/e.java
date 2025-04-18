package com.facebook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements b0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10989e;

    public /* synthetic */ e(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i10;
        this.f10986b = obj;
        this.f10987c = obj2;
        this.f10988d = obj3;
        this.f10989e = obj4;
    }

    @Override // com.facebook.b0
    public final void a(k0 response) {
        Boolean bool;
        EnumSet enumSet;
        JSONArray optJSONArray;
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                AtomicBoolean permissionsCallSucceeded = (AtomicBoolean) this.f10986b;
                Set permissions = (Set) this.f10987c;
                Set declinedPermissions = (Set) this.f10988d;
                Set expiredPermissions = (Set) this.f10989e;
                Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Intrinsics.checkNotNullParameter(permissions, "$permissions");
                Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
                Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f11169d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                    permissionsCallSucceeded.set(true);
                    int length = optJSONArray.length();
                    if (length <= 0) {
                        return;
                    }
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String status = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                            if (!com.facebook.internal.m0.z(optString) && !com.facebook.internal.m0.z(status)) {
                                Intrinsics.checkNotNullExpressionValue(status, "status");
                                Locale US = Locale.US;
                                Intrinsics.checkNotNullExpressionValue(US, "US");
                                String status2 = status.toLowerCase(US);
                                Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                                Intrinsics.checkNotNullExpressionValue(status2, "status");
                                int hashCode = status2.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && status2.equals("declined")) {
                                            declinedPermissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                                    } else {
                                        if (status2.equals("granted")) {
                                            permissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                                    }
                                } else {
                                    if (status2.equals("expired")) {
                                        expiredPermissions.add(optString);
                                    }
                                    Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                                }
                            }
                        }
                        if (i12 < length) {
                            i10 = i12;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                com.facebook.appevents.b accessTokenAppId = (com.facebook.appevents.b) this.f10986b;
                g0 postRequest = (g0) this.f10987c;
                com.facebook.appevents.u appEvents = (com.facebook.appevents.u) this.f10988d;
                androidx.recyclerview.widget.s0 flushState = (androidx.recyclerview.widget.s0) this.f10989e;
                kc.c cVar = com.facebook.appevents.h.a;
                if (!m6.a.b(com.facebook.appevents.h.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        Intrinsics.checkNotNullParameter(flushState, "$flushState");
                        Intrinsics.checkNotNullParameter(response, "response");
                        com.facebook.appevents.h.e(flushState, postRequest, response, accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th2) {
                        m6.a.a(com.facebook.appevents.h.class, th2);
                        return;
                    }
                }
                return;
            default:
                final com.facebook.login.i this$0 = (com.facebook.login.i) this.f10986b;
                final String accessToken = (String) this.f10987c;
                final Date date = (Date) this.f10988d;
                final Date date2 = (Date) this.f10989e;
                int i13 = com.facebook.login.i.f11223n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$0.f11228g.get()) {
                    u uVar = response.f11168c;
                    if (uVar != null) {
                        q qVar = uVar.f11412k;
                        if (qVar == null) {
                            qVar = new q();
                        }
                        this$0.h(qVar);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = response.f11167b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        final String string = jSONObject2.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
                        final p3.l h10 = ni.a.h(jSONObject2);
                        String string2 = jSONObject2.getString("name");
                        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
                        com.facebook.login.g gVar = this$0.f11231j;
                        if (gVar != null) {
                            h6.b bVar = h6.b.a;
                            h6.b.a(gVar.f11214c);
                        }
                        com.facebook.internal.z zVar = com.facebook.internal.z.a;
                        com.facebook.internal.x b3 = com.facebook.internal.z.b(x.b());
                        if (b3 == null || (enumSet = b3.f11122c) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(enumSet.contains(com.facebook.internal.i0.RequireConfirm));
                        }
                        if (Intrinsics.areEqual(bool, Boolean.TRUE) && !this$0.f11233l) {
                            this$0.f11233l = true;
                            String string3 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                            String string4 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                            String string5 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                            Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String h11 = com.applovin.impl.mediation.ads.e.h(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                            AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(h11, new DialogInterface.OnClickListener() { // from class: com.facebook.login.f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    i this$02 = i.this;
                                    String userId = string;
                                    p3.l permissions2 = h10;
                                    String accessToken2 = accessToken;
                                    Date date3 = date;
                                    Date date4 = date2;
                                    int i15 = i.f11223n;
                                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                                    Intrinsics.checkNotNullParameter(userId, "$userId");
                                    Intrinsics.checkNotNullParameter(permissions2, "$permissions");
                                    Intrinsics.checkNotNullParameter(accessToken2, "$accessToken");
                                    this$02.c(userId, permissions2, accessToken2, date3, date4);
                                }
                            }).setPositiveButton(string5, new z2.c(this$0, i11));
                            builder.create().show();
                            return;
                        }
                        this$0.c(string, h10, accessToken, date, date2);
                        return;
                    } catch (JSONException e2) {
                        this$0.h(new q(e2));
                        return;
                    }
                }
                return;
        }
    }
}
