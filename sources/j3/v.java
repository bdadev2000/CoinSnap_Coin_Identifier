package j3;

import Q7.n0;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f21099a;

    public v(long j7) {
        this.f21099a = j7;
    }

    public static v a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new v(Long.parseLong(jsonReader.nextString()));
                    }
                    return new v(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        if (this.f21099a == ((v) obj).f21099a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f21099a;
        return ((int) ((j7 >>> 32) ^ j7)) ^ 1000003;
    }

    public final String toString() {
        return n0.k(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f21099a, "}");
    }
}
