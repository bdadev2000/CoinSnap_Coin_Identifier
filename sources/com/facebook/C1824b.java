package com.facebook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1824b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13521a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13524e;

    public /* synthetic */ C1824b(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f13521a = i9;
        this.b = obj;
        this.f13522c = obj2;
        this.f13523d = obj3;
        this.f13524e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.facebook.login.j, androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // com.facebook.v
    public final void a(F f9) {
        JSONArray optJSONArray;
        EnumSet enumSet;
        int i9 = 0;
        switch (this.f13521a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                G7.j.e(atomicBoolean, "$permissionsCallSucceeded");
                Set set = (Set) this.f13522c;
                G7.j.e(set, "$permissions");
                Set set2 = (Set) this.f13523d;
                G7.j.e(set2, "$declinedPermissions");
                Set set3 = (Set) this.f13524e;
                G7.j.e(set3, "$expiredPermissions");
                JSONObject jSONObject = f9.f13408d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                    atomicBoolean.set(true);
                    int length = optJSONArray.length();
                    if (length <= 0) {
                        return;
                    }
                    while (true) {
                        int i10 = i9 + 1;
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                            if (!com.facebook.internal.H.B(optString) && !com.facebook.internal.H.B(optString2)) {
                                G7.j.d(optString2, NotificationCompat.CATEGORY_STATUS);
                                Locale locale = Locale.US;
                                G7.j.d(locale, "US");
                                String lowerCase = optString2.toLowerCase(locale);
                                G7.j.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                int hashCode = lowerCase.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                            set2.add(optString);
                                        }
                                        Log.w("AccessTokenManager", G7.j.j(lowerCase, "Unexpected status: "));
                                    } else {
                                        if (lowerCase.equals("granted")) {
                                            set.add(optString);
                                        }
                                        Log.w("AccessTokenManager", G7.j.j(lowerCase, "Unexpected status: "));
                                    }
                                } else {
                                    if (lowerCase.equals("expired")) {
                                        set3.add(optString);
                                    }
                                    Log.w("AccessTokenManager", G7.j.j(lowerCase, "Unexpected status: "));
                                }
                            }
                        }
                        if (i10 < length) {
                            i9 = i10;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                com.facebook.appevents.b bVar = (com.facebook.appevents.b) this.b;
                C c9 = (C) this.f13522c;
                com.facebook.appevents.s sVar = (com.facebook.appevents.s) this.f13523d;
                B3.g gVar = (B3.g) this.f13524e;
                if (!O2.a.b(com.facebook.appevents.h.class)) {
                    try {
                        G7.j.e(bVar, "$accessTokenAppId");
                        G7.j.e(c9, "$postRequest");
                        G7.j.e(sVar, "$appEvents");
                        G7.j.e(gVar, "$flushState");
                        com.facebook.appevents.h.e(bVar, c9, f9, sVar, gVar);
                        return;
                    } catch (Throwable th) {
                        O2.a.a(com.facebook.appevents.h.class, th);
                        return;
                    }
                }
                return;
            default:
                final ?? r22 = (com.facebook.login.j) this.b;
                final String str = (String) this.f13522c;
                final Date date = (Date) this.f13523d;
                final Date date2 = (Date) this.f13524e;
                G7.j.e(r22, "this$0");
                G7.j.e(str, "$accessToken");
                if (!r22.f13717g.get()) {
                    p pVar = f9.f13407c;
                    if (pVar != null) {
                        C1849l c1849l = pVar.f13799k;
                        C1849l c1849l2 = c1849l;
                        if (c1849l == null) {
                            c1849l2 = new RuntimeException();
                        }
                        r22.f(c1849l2);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = f9.b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        final String string = jSONObject2.getString("id");
                        G7.j.d(string, "jsonObject.getString(\"id\")");
                        final C.c i11 = R3.e.i(jSONObject2);
                        String string2 = jSONObject2.getString("name");
                        G7.j.d(string2, "jsonObject.getString(\"name\")");
                        com.facebook.login.h hVar = r22.f13720j;
                        if (hVar != null) {
                            J2.b bVar2 = J2.b.f1569a;
                            J2.b.a(hVar.f13710c);
                        }
                        com.facebook.internal.w wVar = com.facebook.internal.w.f13674a;
                        com.facebook.internal.t b = com.facebook.internal.w.b(r.b());
                        Boolean bool = null;
                        if (b != null && (enumSet = b.f13659c) != null) {
                            bool = Boolean.valueOf(enumSet.contains(com.facebook.internal.E.RequireConfirm));
                        }
                        if (G7.j.a(bool, Boolean.TRUE) && !r22.l) {
                            r22.l = true;
                            String string3 = r22.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                            G7.j.d(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                            String string4 = r22.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                            G7.j.d(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                            String string5 = r22.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                            G7.j.d(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                            String format = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                            AlertDialog.Builder builder = new AlertDialog.Builder(r22.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i12) {
                                    j jVar = j.this;
                                    G7.j.e(jVar, "this$0");
                                    String str2 = string;
                                    G7.j.e(str2, "$userId");
                                    C.c cVar = i11;
                                    G7.j.e(cVar, "$permissions");
                                    String str3 = str;
                                    G7.j.e(str3, "$accessToken");
                                    jVar.c(str2, cVar, str3, date, date2);
                                }
                            }).setPositiveButton(string5, new com.facebook.login.g(r22, i9));
                            builder.create().show();
                            return;
                        }
                        r22.c(string, i11, str, date, date2);
                        return;
                    } catch (JSONException e4) {
                        r22.f(new RuntimeException(e4));
                        return;
                    }
                }
                return;
        }
    }
}
