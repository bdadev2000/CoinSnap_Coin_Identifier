package va;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes3.dex */
public final class i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26407c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26408d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26409e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26410f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26411g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f26406b = str;
        this.a = str2;
        this.f26407c = str3;
        this.f26408d = str4;
        this.f26409e = str5;
        this.f26410f = str6;
        this.f26411g = str7;
    }

    public static i a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Objects.equal(this.f26406b, iVar.f26406b) || !Objects.equal(this.a, iVar.a) || !Objects.equal(this.f26407c, iVar.f26407c) || !Objects.equal(this.f26408d, iVar.f26408d) || !Objects.equal(this.f26409e, iVar.f26409e) || !Objects.equal(this.f26410f, iVar.f26410f) || !Objects.equal(this.f26411g, iVar.f26411g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f26406b, this.a, this.f26407c, this.f26408d, this.f26409e, this.f26410f, this.f26411g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f26406b).add("apiKey", this.a).add("databaseUrl", this.f26407c).add("gcmSenderId", this.f26409e).add("storageBucket", this.f26410f).add("projectId", this.f26411g).toString();
    }
}
