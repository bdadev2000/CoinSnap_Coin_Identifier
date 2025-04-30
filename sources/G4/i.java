package g4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20446a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20447c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20448d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20449e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20450f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20451g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.f20446a = str2;
        this.f20447c = str3;
        this.f20448d = str4;
        this.f20449e = str5;
        this.f20450f = str6;
        this.f20451g = str7;
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
        if (!Objects.equal(this.b, iVar.b) || !Objects.equal(this.f20446a, iVar.f20446a) || !Objects.equal(this.f20447c, iVar.f20447c) || !Objects.equal(this.f20448d, iVar.f20448d) || !Objects.equal(this.f20449e, iVar.f20449e) || !Objects.equal(this.f20450f, iVar.f20450f) || !Objects.equal(this.f20451g, iVar.f20451g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.f20446a, this.f20447c, this.f20448d, this.f20449e, this.f20450f, this.f20451g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.f20446a).add("databaseUrl", this.f20447c).add("gcmSenderId", this.f20449e).add("storageBucket", this.f20450f).add("projectId", this.f20451g).toString();
    }
}
