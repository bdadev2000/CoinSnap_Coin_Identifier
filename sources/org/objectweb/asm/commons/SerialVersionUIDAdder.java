package org.objectweb.asm.commons;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class SerialVersionUIDAdder extends ClassVisitor {
    private static final String CLINIT = "<clinit>";
    private int access;
    private boolean computeSvuid;
    private boolean hasStaticInitializer;
    private boolean hasSvuid;
    private String[] interfaces;
    private String name;
    private Collection<Item> svuidConstructors;
    private Collection<Item> svuidFields;
    private Collection<Item> svuidMethods;

    /* loaded from: classes3.dex */
    public static final class Item implements Comparable<Item> {
        final int access;
        final String descriptor;
        final String name;

        public Item(String str, int i2, String str2) {
            this.name = str;
            this.access = i2;
            this.descriptor = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Item) && compareTo((Item) obj) == 0;
        }

        public int hashCode() {
            return this.name.hashCode() ^ this.descriptor.hashCode();
        }

        @Override // java.lang.Comparable
        public int compareTo(Item item) {
            int compareTo = this.name.compareTo(item.name);
            return compareTo == 0 ? this.descriptor.compareTo(item.descriptor) : compareTo;
        }
    }

    public SerialVersionUIDAdder(ClassVisitor classVisitor) {
        this(589824, classVisitor);
        if (getClass() != SerialVersionUIDAdder.class) {
            throw new IllegalStateException();
        }
    }

    private static void writeItems(Collection<Item> collection, DataOutput dataOutput, boolean z2) throws IOException {
        Item[] itemArr = (Item[]) collection.toArray(new Item[0]);
        Arrays.sort(itemArr);
        for (Item item : itemArr) {
            dataOutput.writeUTF(item.name);
            dataOutput.writeInt(item.access);
            String str = item.descriptor;
            if (z2) {
                str = str.replace('/', '.');
            }
            dataOutput.writeUTF(str);
        }
    }

    public void addSVUID(long j2) {
        FieldVisitor visitField = super.visitField(24, "serialVersionUID", "J", null, Long.valueOf(j2));
        if (visitField != null) {
            visitField.visitEnd();
        }
    }

    public byte[] computeSHAdigest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public long computeSVUID() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeUTF(this.name.replace('/', '.'));
                int i2 = this.access;
                if ((i2 & 512) != 0) {
                    i2 = this.svuidMethods.isEmpty() ? i2 & (-1025) : i2 | 1024;
                }
                dataOutputStream.writeInt(i2 & 1553);
                Arrays.sort(this.interfaces);
                for (String str : this.interfaces) {
                    dataOutputStream.writeUTF(str.replace('/', '.'));
                }
                writeItems(this.svuidFields, dataOutputStream, false);
                if (this.hasStaticInitializer) {
                    dataOutputStream.writeUTF(CLINIT);
                    dataOutputStream.writeInt(8);
                    dataOutputStream.writeUTF("()V");
                }
                writeItems(this.svuidConstructors, dataOutputStream, true);
                writeItems(this.svuidMethods, dataOutputStream, true);
                dataOutputStream.flush();
                long j2 = 0;
                for (int min = Math.min(computeSHAdigest(byteArrayOutputStream.toByteArray()).length, 8) - 1; min >= 0; min--) {
                    j2 = (j2 << 8) | (r2[min] & UnsignedBytes.MAX_VALUE);
                }
                dataOutputStream.close();
                byteArrayOutputStream.close();
                return j2;
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public boolean hasSVUID() {
        return this.hasSvuid;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i2, int i3, String str, String str2, String str3, String[] strArr) {
        boolean z2 = (i3 & 16384) == 0;
        this.computeSvuid = z2;
        if (z2) {
            this.name = str;
            this.access = i3;
            this.interfaces = (String[]) strArr.clone();
            this.svuidFields = new ArrayList();
            this.svuidConstructors = new ArrayList();
            this.svuidMethods = new ArrayList();
        }
        super.visit(i2, i3, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        if (this.computeSvuid && !this.hasSvuid) {
            try {
                addSVUID(computeSVUID());
            } catch (IOException e) {
                throw new IllegalStateException("Error while computing SVUID for " + this.name, e);
            }
        }
        super.visitEnd();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i2, String str, String str2, String str3, Object obj) {
        if (this.computeSvuid) {
            if ("serialVersionUID".equals(str)) {
                this.computeSvuid = false;
                this.hasSvuid = true;
            }
            if ((i2 & 2) == 0 || (i2 & Opcodes.L2I) == 0) {
                this.svuidFields.add(new Item(str, i2 & 223, str2));
            }
        }
        return super.visitField(i2, str, str2, str3, obj);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i2) {
        String str4 = this.name;
        if (str4 != null && str4.equals(str)) {
            this.access = i2;
        }
        super.visitInnerClass(str, str2, str3, i2);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr) {
        if (this.computeSvuid) {
            if (CLINIT.equals(str)) {
                this.hasStaticInitializer = true;
            }
            int i3 = i2 & 3391;
            if ((i2 & 2) == 0) {
                if ("<init>".equals(str)) {
                    this.svuidConstructors.add(new Item(str, i3, str2));
                } else if (!CLINIT.equals(str)) {
                    this.svuidMethods.add(new Item(str, i3, str2));
                }
            }
        }
        return super.visitMethod(i2, str, str2, str3, strArr);
    }

    public SerialVersionUIDAdder(int i2, ClassVisitor classVisitor) {
        super(i2, classVisitor);
    }
}
