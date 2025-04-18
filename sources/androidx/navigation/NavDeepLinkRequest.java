package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public class NavDeepLinkRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20428b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20429c;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* loaded from: classes2.dex */
        public static final class Companion {
        }
    }

    public NavDeepLinkRequest(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f20427a = data;
        this.f20428b = action;
        this.f20429c = type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f20427a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f20428b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f20429c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
