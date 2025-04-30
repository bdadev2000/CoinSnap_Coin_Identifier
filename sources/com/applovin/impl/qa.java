package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qa extends ak {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f10220c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f10221a = Charsets.UTF_8.newDecoder();
    private final CharsetDecoder b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        String a6 = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a6 == null) {
            return new we(new sa(bArr, null, null));
        }
        Matcher matcher = f10220c.matcher(a6);
        String str2 = null;
        for (int i9 = 0; matcher.find(i9); i9 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new we(new sa(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.f10221a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f10221a.reset();
            byteBuffer.rewind();
        }
    }
}
