package androidx.privacysandbox.ads.adservices.topics;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.compose.ui.platform.j;

/* loaded from: classes3.dex */
public final class Topic {

    /* renamed from: a, reason: collision with root package name */
    public final long f20865a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20867c;

    public Topic(long j2, long j3, int i2) {
        this.f20865a = j2;
        this.f20866b = j3;
        this.f20867c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.f20865a == topic.f20865a && this.f20866b == topic.f20866b && this.f20867c == topic.f20867c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20867c) + d.d(this.f20866b, Long.hashCode(this.f20865a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f20865a);
        sb.append(", ModelVersion=");
        sb.append(this.f20866b);
        sb.append(", TopicCode=");
        return j.b("Topic { ", a.n(sb, this.f20867c, " }"));
    }
}
