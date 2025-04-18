package com.mbridge.msdk.thrid.okio;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class HashingSource extends ForwardingSource {
    private final Mac mac;
    private final MessageDigest messageDigest;

    private HashingSource(Source source, String str) {
        super(source);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
            this.mac = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static HashingSource hmacSha1(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, "HmacSHA1");
    }

    public static HashingSource hmacSha256(Source source, ByteString byteString) {
        return new HashingSource(source, byteString, "HmacSHA256");
    }

    public static HashingSource md5(Source source) {
        return new HashingSource(source, SameMD5.TAG);
    }

    public static HashingSource sha1(Source source) {
        return new HashingSource(source, "SHA-1");
    }

    public static HashingSource sha256(Source source) {
        return new HashingSource(source, Constants.SHA256);
    }

    public final ByteString hash() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            doFinal = this.mac.doFinal();
        }
        return ByteString.of(doFinal);
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSource, com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        long read = super.read(buffer, j3);
        if (read != -1) {
            long j10 = buffer.size;
            long j11 = j10 - read;
            Segment segment = buffer.head;
            while (j10 > j11) {
                segment = segment.prev;
                j10 -= segment.limit - segment.pos;
            }
            while (j10 < buffer.size) {
                int i10 = (int) ((segment.pos + j11) - j10);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    this.mac.update(segment.data, i10, segment.limit - i10);
                }
                j11 = (segment.limit - segment.pos) + j10;
                segment = segment.next;
                j10 = j11;
            }
        }
        return read;
    }

    private HashingSource(Source source, ByteString byteString, String str) {
        super(source);
        try {
            Mac mac = Mac.getInstance(str);
            this.mac = mac;
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.messageDigest = null;
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
