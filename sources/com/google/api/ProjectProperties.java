package com.google.api;

import a4.Q0;
import a4.R0;
import a4.V0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ProjectProperties extends L2 implements O3 {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 properties_ = L2.emptyProtobufList();

    static {
        ProjectProperties projectProperties = new ProjectProperties();
        DEFAULT_INSTANCE = projectProperties;
        L2.registerDefaultInstance(ProjectProperties.class, projectProperties);
    }

    private ProjectProperties() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProperties(Iterable<? extends Property> iterable) {
        ensurePropertiesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.properties_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(property);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperties() {
        this.properties_ = L2.emptyProtobufList();
    }

    private void ensurePropertiesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.properties_;
        if (!interfaceC1891d3.isModifiable()) {
            this.properties_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static R0 newBuilder() {
        return (R0) DEFAULT_INSTANCE.createBuilder();
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProperties(int i9) {
        ensurePropertiesIsMutable();
        this.properties_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperties(int i9, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.set(i9, property);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (Q0.f3975a[k22.ordinal()]) {
            case 1:
                return new ProjectProperties();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", Property.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ProjectProperties.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Property getProperties(int i9) {
        return (Property) this.properties_.get(i9);
    }

    public int getPropertiesCount() {
        return this.properties_.size();
    }

    public List<Property> getPropertiesList() {
        return this.properties_;
    }

    public V0 getPropertiesOrBuilder(int i9) {
        return (V0) this.properties_.get(i9);
    }

    public List<? extends V0> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    public static R0 newBuilder(ProjectProperties projectProperties) {
        return (R0) DEFAULT_INSTANCE.createBuilder(projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ProjectProperties) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ProjectProperties parseFrom(H h6) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(int i9, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(i9, property);
    }

    public static ProjectProperties parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ProjectProperties parseFrom(byte[] bArr) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProjectProperties parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ProjectProperties parseFrom(S s5) throws IOException {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ProjectProperties parseFrom(S s5, W1 w1) throws IOException {
        return (ProjectProperties) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
