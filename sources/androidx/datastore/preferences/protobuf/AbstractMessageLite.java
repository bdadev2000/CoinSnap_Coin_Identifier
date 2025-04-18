package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode;

    /* loaded from: classes4.dex */
    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {

        /* loaded from: classes4.dex */
        public static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            public int f19102a;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f19102a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() {
                if (this.f19102a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f19102a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j2) {
                long skip = super.skip(Math.min(j2, this.f19102a));
                if (skip >= 0) {
                    this.f19102a = (int) (this.f19102a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                int i4 = this.f19102a;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f19102a -= read;
                }
                return read;
            }
        }

        @Override // 
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        public abstract GeneratedMessageLite.Builder i(AbstractMessageLite abstractMessageLite);

        public final Builder j(MessageLite messageLite) {
            if (((GeneratedMessageLite.Builder) this).f19238a.getClass().isInstance(messageLite)) {
                return i((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* loaded from: classes4.dex */
    public interface InternalOneOfEnum {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Iterable iterable, Internal.ProtobufList protobufList) {
        Charset charset = Internal.f19251a;
        iterable.getClass();
        if (iterable instanceof LazyStringList) {
            List s2 = ((LazyStringList) iterable).s();
            LazyStringList lazyStringList = (LazyStringList) protobufList;
            int size = protobufList.size();
            for (Object obj : s2) {
                if (obj == null) {
                    String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                    for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                        lazyStringList.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    lazyStringList.D((ByteString) obj);
                } else {
                    lazyStringList.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof PrimitiveNonBoxingCollection) {
            protobufList.addAll((Collection) iterable);
            return;
        }
        if ((protobufList instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) protobufList).ensureCapacity(((Collection) iterable).size() + protobufList.size());
        }
        int size3 = protobufList.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (protobufList.size() - size3) + " is null.";
                for (int size4 = protobufList.size() - 1; size4 >= size3; size4--) {
                    protobufList.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            protobufList.add(obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final ByteString b() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int c2 = generatedMessageLite.c();
            ByteString byteString = ByteString.f19122b;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(c2);
            CodedOutputStream codedOutputStream = codedBuilder.f19130a;
            generatedMessageLite.g(codedOutputStream);
            CodedOutputStream.ArrayEncoder arrayEncoder = (CodedOutputStream.ArrayEncoder) codedOutputStream;
            if (arrayEncoder.e - arrayEncoder.f19165f == 0) {
                return new ByteString.LiteralByteString(codedBuilder.f19131b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public final int j(Schema schema) {
        int i2 = i();
        if (i2 != -1) {
            return i2;
        }
        int e = schema.e(this);
        k(e);
        return e;
    }

    public void k(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void l(OutputStream outputStream) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int c2 = generatedMessageLite.c();
        Logger logger = CodedOutputStream.f19161b;
        if (c2 > 4096) {
            c2 = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, c2);
        generatedMessageLite.g(outputStreamEncoder);
        if (outputStreamEncoder.f19164f > 0) {
            outputStreamEncoder.N0();
        }
    }
}
