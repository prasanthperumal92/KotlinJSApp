config.devServer = {
  "open": true,
  "static": [
    "kotlin",
    "../../../processedResources/js/main"
  ],
  "client": {
    "overlay": {
      "errors": true,
      "warnings": false
    }
  },
  allowedHosts: ['.ngrok-free.app'],
};