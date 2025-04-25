package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes7.dex */
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {
    private static String defaultPropertiesFile = "AwsCredentials.properties";
    private final String credentialsFilePath;

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public void refresh() {
    }

    public ClasspathPropertiesFileCredentialsProvider() {
        this(defaultPropertiesFile);
    }

    public ClasspathPropertiesFileCredentialsProvider(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Credentials file path cannot be null");
        }
        if (!str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            this.credentialsFilePath = RemoteSettings.FORWARD_SLASH_STRING + str;
        } else {
            this.credentialsFilePath = str;
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials getCredentials() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.credentialsFilePath);
        if (resourceAsStream == null) {
            throw new AmazonClientException("Unable to load AWS credentials from the " + this.credentialsFilePath + " file on the classpath");
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to load AWS credentials from the " + this.credentialsFilePath + " file on the classpath", e);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.credentialsFilePath + ")";
    }
}
