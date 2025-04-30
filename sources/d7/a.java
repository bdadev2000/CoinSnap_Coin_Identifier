package D7;

import G7.j;
import O7.g;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes3.dex */
public abstract class a extends c {
    public static String W(File file) {
        String name = file.getName();
        j.d(name, "getName(...)");
        int M8 = g.M(6, name, ".");
        if (M8 != -1) {
            String substring = name.substring(0, M8);
            j.d(substring, "substring(...)");
            return substring;
        }
        return name;
    }

    public static String X(File file) {
        Charset charset = O7.a.f2244a;
        j.e(file, "<this>");
        j.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String T2 = d.T(inputStreamReader);
            android.support.v4.media.session.a.f(inputStreamReader, null);
            return T2;
        } finally {
        }
    }

    public static final void Y(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z8;
        j.e(str, MimeTypes.BASE_TYPE_TEXT);
        j.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            j.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(FragmentTransaction.TRANSIT_EXIT_MASK);
        j.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(FragmentTransaction.TRANSIT_EXIT_MASK * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        j.d(allocate2, "allocate(...)");
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int min = Math.min(8192 - i10, str.length() - i9);
            int i11 = i9 + min;
            char[] array = allocate.array();
            j.d(array, "array(...)");
            str.getChars(i9, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (i11 == str.length()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z8).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i10 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i9 = i11;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }
}
