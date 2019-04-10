package com.devamit.uploadclient;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class JagoHaridwarUploader {

    static AmazonS3 s3client;
    static Cloudinary cloudinary;

    public static void main(String[] args) {
        AWSCredentials credentials = new BasicAWSCredentials("YOU API KEY",
                "YOUR SECRET KEY");
        s3client = new AmazonS3Client(credentials);

        cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "CLOUD NAME",
                "api_key", "API KEY",
                "api_secret", "CLOUDINARY IS AWESOME",
                "upload_preset", "TRY IT"));
        System.out.println(cloudinary.toString());

        java.awt.EventQueue.invokeLater(() -> {
            new Base().setVisible(true);
        });
    }
}