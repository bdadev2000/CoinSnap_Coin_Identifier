package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1873b implements M3 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t9 : iterable) {
            if (t9 == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list.add(t9);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public static C1984q5 newUninitializedMessageException(N3 n32) {
        return new C1984q5(n32);
    }

    @Override // com.google.protobuf.M3
    public abstract /* synthetic */ N3 build();

    @Override // com.google.protobuf.M3
    public abstract /* synthetic */ N3 buildPartial();

    @Override // com.google.protobuf.M3
    public abstract /* synthetic */ M3 clear();

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC1873b mo1clone();

    @Override // com.google.protobuf.M3, com.google.protobuf.O3
    public abstract /* synthetic */ N3 getDefaultInstanceForType();

    public abstract AbstractC1873b internalMergeFrom(AbstractC1880c abstractC1880c);

    @Override // com.google.protobuf.M3, com.google.protobuf.O3
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.M3
    public boolean mergeDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mergeFrom((InputStream) new C1866a(inputStream, S.readRawVarint32(read, inputStream)), w1);
        return true;
    }

    @Override // com.google.protobuf.M3
    public abstract AbstractC1873b mergeFrom(S s5, W1 w1) throws IOException;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C1898e3.checkNotNull(iterable);
        if (iterable instanceof InterfaceC1988r3) {
            List<?> underlyingElements = ((InterfaceC1988r3) iterable).getUnderlyingElements();
            InterfaceC1988r3 interfaceC1988r3 = (InterfaceC1988r3) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1988r3.size() - size) + " is null.";
                    for (int size2 = interfaceC1988r3.size() - 1; size2 >= size; size2--) {
                        interfaceC1988r3.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof H) {
                    interfaceC1988r3.add((H) obj);
                } else {
                    interfaceC1988r3.add((InterfaceC1988r3) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1955m4) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    @Override // com.google.protobuf.M3
    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        return mergeDelimitedFrom(inputStream, W1.getEmptyRegistry());
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(S s5) throws IOException {
        return mergeFrom(s5, W1.getEmptyRegistry());
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(H h6) throws C1912g3 {
        try {
            S newCodedInput = h6.newCodedInput();
            mergeFrom(newCodedInput);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (C1912g3 e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e9);
        }
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(H h6, W1 w1) throws C1912g3 {
        try {
            S newCodedInput = h6.newCodedInput();
            mergeFrom(newCodedInput, w1);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (C1912g3 e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e9);
        }
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(byte[] bArr) throws C1912g3 {
        return mergeFrom(bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(byte[] bArr, int i9, int i10) throws C1912g3 {
        try {
            S newInstance = S.newInstance(bArr, i9, i10);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (C1912g3 e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e9);
        }
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return mergeFrom(bArr, 0, bArr.length, w1);
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        try {
            S newInstance = S.newInstance(bArr, i9, i10);
            mergeFrom(newInstance, w1);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (C1912g3 e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e9);
        }
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(InputStream inputStream) throws IOException {
        S newInstance = S.newInstance(inputStream);
        mergeFrom(newInstance);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(InputStream inputStream, W1 w1) throws IOException {
        S newInstance = S.newInstance(inputStream);
        mergeFrom(newInstance, w1);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // com.google.protobuf.M3
    public AbstractC1873b mergeFrom(N3 n32) {
        if (getDefaultInstanceForType().getClass().isInstance(n32)) {
            return internalMergeFrom((AbstractC1880c) n32);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
