package h7;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v {
    public final long a;

    public v(long j3) {
        this.a = j3;
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
        if (this.a == ((v) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        return ((int) ((j3 >>> 32) ^ j3)) ^ 1000003;
    }

    public final String toString() {
        return a4.j.j(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
