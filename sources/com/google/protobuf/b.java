package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b implements n5 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t5 : iterable) {
            if (t5 == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list.add(t5);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public static r8 newUninitializedMessageException(o5 o5Var) {
        return new r8(o5Var);
    }

    @Override // com.google.protobuf.n5
    public abstract /* synthetic */ o5 build();

    @Override // com.google.protobuf.n5
    public abstract /* synthetic */ o5 buildPartial();

    @Override // com.google.protobuf.n5
    public abstract /* synthetic */ n5 clear();

    @Override // 
    /* renamed from: clone */
    public abstract b mo4clone();

    @Override // com.google.protobuf.n5, com.google.protobuf.p5, com.google.protobuf.k3
    public abstract /* synthetic */ o5 getDefaultInstanceForType();

    public abstract b internalMergeFrom(c cVar);

    @Override // com.google.protobuf.n5, com.google.protobuf.p5
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.n5
    public boolean mergeDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mergeFrom((InputStream) new a(inputStream, r0.readRawVarint32(read, inputStream)), a2Var);
        return true;
    }

    @Override // com.google.protobuf.n5
    public abstract b mergeFrom(r0 r0Var, a2 a2Var) throws IOException;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        f4.checkNotNull(iterable);
        if (iterable instanceof s4) {
            List<?> underlyingElements = ((s4) iterable).getUnderlyingElements();
            s4 s4Var = (s4) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (s4Var.size() - size) + " is null.";
                    for (int size2 = s4Var.size() - 1; size2 >= size; size2--) {
                        s4Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof h0) {
                    s4Var.add((h0) obj);
                } else {
                    s4Var.add((s4) obj);
                }
            }
            return;
        }
        if (iterable instanceof n6) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    @Override // com.google.protobuf.n5
    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        return mergeDelimitedFrom(inputStream, a2.getEmptyRegistry());
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(r0 r0Var) throws IOException {
        return mergeFrom(r0Var, a2.getEmptyRegistry());
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(h0 h0Var) throws h4 {
        try {
            r0 newCodedInput = h0Var.newCodedInput();
            mergeFrom(newCodedInput);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (h4 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(h0 h0Var, a2 a2Var) throws h4 {
        try {
            r0 newCodedInput = h0Var.newCodedInput();
            mergeFrom(newCodedInput, a2Var);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (h4 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(byte[] bArr) throws h4 {
        return mergeFrom(bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(byte[] bArr, int i10, int i11) throws h4 {
        try {
            r0 newInstance = r0.newInstance(bArr, i10, i11);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (h4 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e10);
        }
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(byte[] bArr, a2 a2Var) throws h4 {
        return mergeFrom(bArr, 0, bArr.length, a2Var);
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        try {
            r0 newInstance = r0.newInstance(bArr, i10, i11);
            mergeFrom(newInstance, a2Var);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (h4 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e10);
        }
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(InputStream inputStream) throws IOException {
        r0 newInstance = r0.newInstance(inputStream);
        mergeFrom(newInstance);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(InputStream inputStream, a2 a2Var) throws IOException {
        r0 newInstance = r0.newInstance(inputStream);
        mergeFrom(newInstance, a2Var);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // com.google.protobuf.n5
    public b mergeFrom(o5 o5Var) {
        if (getDefaultInstanceForType().getClass().isInstance(o5Var)) {
            return internalMergeFrom((c) o5Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
