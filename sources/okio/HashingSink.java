package okio;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class HashingSink extends ForwardingSink implements Sink {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
            p0.a.s(sink, "sink");
            p0.a.s(byteString, SDKConstants.PARAM_KEY);
            return new HashingSink(sink, byteString, "HmacSHA1");
        }

        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
            p0.a.s(sink, "sink");
            p0.a.s(byteString, SDKConstants.PARAM_KEY);
            return new HashingSink(sink, byteString, "HmacSHA256");
        }

        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
            p0.a.s(sink, "sink");
            p0.a.s(byteString, SDKConstants.PARAM_KEY);
            return new HashingSink(sink, byteString, "HmacSHA512");
        }

        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            p0.a.s(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            p0.a.s(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            p0.a.s(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            p0.a.s(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull MessageDigest messageDigest) {
        super(sink);
        p0.a.s(sink, "sink");
        p0.a.s(messageDigest, "digest");
        this.messageDigest = messageDigest;
        this.mac = null;
    }

    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return Companion.md5(sink);
    }

    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return Companion.sha1(sink);
    }

    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return Companion.sha256(sink);
    }

    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return Companion.sha512(sink);
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m784deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            p0.a.p(mac);
            doFinal = mac.doFinal();
        }
        p0.a.p(doFinal);
        return new ByteString(doFinal);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer buffer, long j2) throws IOException {
        p0.a.s(buffer, "source");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j2);
        Segment segment = buffer.head;
        p0.a.p(segment);
        long j3 = 0;
        while (j3 < j2) {
            int min = (int) Math.min(j2 - j3, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                Mac mac = this.mac;
                p0.a.p(mac);
                mac.update(segment.data, segment.pos, min);
            }
            j3 += min;
            segment = segment.next;
            p0.a.p(segment);
        }
        super.write(buffer, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sink"
            p0.a.s(r2, r0)
            java.lang.String r0 = "algorithm"
            p0.a.s(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            p0.a.r(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.HashingSink.<init>(okio.Sink, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        super(sink);
        p0.a.s(sink, "sink");
        p0.a.s(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            p0.a.s(r3, r0)
            java.lang.String r0 = "key"
            p0.a.s(r4, r0)
            java.lang.String r0 = "algorithm"
            p0.a.s(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L23
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L23
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L23
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L23
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L23
            r2.<init>(r3, r0)
            return
        L23:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.HashingSink.<init>(okio.Sink, okio.ByteString, java.lang.String):void");
    }
}
